# webdriver-junit-extents-maven
>Resumo:
>Implementação de Testes Automatizados de Interfaces Gráficas com o uso das tecnologias Java 8, Selenium Webdriver, Maven, Junit e Extents Report;

#### Página testada:
> http://www.automationpractice.com/

#### Pré requisitos:
| requisito | página de download |
| ------    | ------ |
| Java 8    | https://www.oracle.com/br/java/technologies/javase-jdk8-downloads.html |
```sh
Ps: é necessário a configuração das variáveis de ambiente do Java.
```

### Dependências:
| Tecnologia usada | página oficial |
| ------ | ------ |
| JUnit  | https://junit.org/junit4/ |
| Selenium Webdriver | https://www.selenium.dev/ |
| WebDriverManager | https://github.com/bonigarcia/webdrivermanager/ |
| ExtentReports | https://www.extentreports.com/ |
| JFairy | https://devskiller.github.io/jfairy/ |

#### Arquitetura usada:
O projeto usa a arquitetura AppObject.
A Arquitetura AppObject tem como mote a separação entre mapeamento de tela, ações de elementos, verificações e o teste em si.
Cada pacote a seguir representa uma camada da aplicação:
- AppObject -> camada de mapeamento de elementos;
- Tasks -> camada responsavel por implementar as ações dos elementos mapeados;
- VerificationPoints -> é uma camada Task especializada em implementar as verificações
- TestCases -> Nesta camada é onde os testes serão implementados
- TestSuites -> Camada opcional e dependente do framework de testes utilizado. Esta camada tem a função de agrupar os testes conforme a necessidade.

![alt text](https://user-images.githubusercontent.com/80764831/114989448-ce052680-9e6d-11eb-8b91-2f69a5948c75.png)

#### configurations.properties:
Esse arquivo define as principais configurações do projeto:
| Nome da constante | valor padrão | função no projeto |
| ----------------  | ------------ | -------------- |
| DEFAULT_TIMEOUT   | 15           | Define um timeout padrão para a busca dos elementos na página em segundos|
| DEFAULT_PAGE_LOAD | 15           | Define um timeout padrão para o carregamento das páginas em segundos|
| DEFAULT_WAIT      | 15           | Define um tempo de espera padrão em segundos|
| DEFAULT_URL       | http://automationpractice.com/index.php| Define a url principal da pagina a ser testada|
| HEADLESS_TYPE     | false        | Define se o navegador irá rodar no modo headless |
| DEFAULT_BROWSER   | chrome       | Define o navegador a ser usado |
| REPORT_PATH       | ./reports/   | Define o caminho e a pasta para a geração do report |

#### Como executar o teste:
Há três maneiras de executar os dois testes contidos no pacote 'testCases':
- 1- Individualmente: executando cada um como uma classe de teste do Junit, assim cada teste irá seu proprio arquivo de report;
- 2- Como Suite: executando a classe 'ComprasPositivosSuite' como um arquivo de teste do Junit que irá rodar os dois testes e salvará em um só arquivo de report;
- 3- Como task do Maven: ao executar a task 'test' do Maven os dois testes irão rodar individualmente gerando seu próprio arquivo de report;

#### Reports:
Conforme for o tipo de execução dos testes serão gerados, ou arquivos html individuais para cada testes, ou um arquivo úncio agrupando ambos testes.
Os arquivos são gerados na pasta "reports" e podem ser abertos diretamente no navegador. 




