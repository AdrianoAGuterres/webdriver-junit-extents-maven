package com.automationpractice.testSuites;

import com.automationpractice.testCases.AdicionarDoisItensNoCarrinhoCadastrarUsuarioFinalizarCompraComSucessoTestCase;
import com.automationpractice.testCases.AdicionarDoisItensNoCarrinhoLogarFinalizarCompraComSucessoTestCase;
import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdicionarDoisItensNoCarrinhoCadastrarUsuarioFinalizarCompraComSucessoTestCase.class,
                AdicionarDoisItensNoCarrinhoLogarFinalizarCompraComSucessoTestCase.class})
public class ComprasPositivosSuite {

    @BeforeClass
    public static void setUpClass() {
        Report.initializeReport("Suite de compras", "Testes de compras", true);
    }

    @AfterClass
    public static void tearDownClass() {
        Report.endSuiteReport();
    }

}
