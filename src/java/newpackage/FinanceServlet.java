package newpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/FinanceServlet"})
public class FinanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
            int loanTerm = Integer.parseInt(request.getParameter("loanTerm"));
            double interestRate = Double.parseDouble(request.getParameter("interestRate"));
            double monthlyCost = Double.parseDouble(request.getParameter("monthlyCost"));

            List<Prestacao> prestacoes = new ArrayList<>();
            double saldoDevedor = loanAmount;

            for (int i = 1; i <= loanTerm; i++) {
                double juros = saldoDevedor * (interestRate / 100);
                double parcelaFixa = loanAmount / loanTerm;
                double custoMensal = monthlyCost;
                double valorTotalPrestacao = juros + parcelaFixa + custoMensal;

                Prestacao prestacao = new Prestacao(i, parcelaFixa, juros, custoMensal, valorTotalPrestacao);
                prestacoes.add(prestacao);

                saldoDevedor -= parcelaFixa;
            }

            HttpSession session = request.getSession();
            session.setAttribute("prestacoes", prestacoes);

            response.sendRedirect("result.jsp");
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Por favor, preencha todos os campos com valores válidos.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}


