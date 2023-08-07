# DesafioConhecimentoTecnico
Projeto para conhecimento técnico em desenvolvimento Java

# Tecnologias utilizadas
Para a criação do aplicativo com o framework Spring conforme solicitado fora utilizado Spring Boot;
Para o gerenciamento do projeto fora utilizado o Spring Tool Suite;
Para a documentação fora integrado Swagger UI.

# Chamada de serviços
Tendo como base a utilização do STS, para inicializar o projeto basta importar o projeto utilizando - se Gradle e Java 11;
Com o projeto devidamente importado, basta inicializar acessando Run As > Spring Boot App;
O projeto ficará disponivel na url http://localhost:8081/

Para acessar a listagem completa dos EnteDeclaradoUtilidaddePublicaEstadual:
-> http://localhost:8081/desafio/getEntesDeclaradosUtilidadePublicaEstadual

Para realizar o login incluindo os parametros user e pass conforme especificado na documentação:
-> http://localhost:8081/desafio/auth?user=cartorio&pass=selodigital

Para filtrar a lista de EnteDeclaradoUtilidaddePublicaEstadual por Id referenciando o Id que desejar:
-> http://localhost:8081/desafio/getEntesDeclaradosUtilidadePublicaEstadual/filterById?id=1

Para filtrar a lista de EnteDeclaradoUtilidaddePublicaEstadual por Nome da Entidade referenciando o nome como por exemplo "SOCIEDADE RECREATIVA ESPORTIVA":
-> http://localhost:8081/desafio/getEntesDeclaradosUtilidadePublicaEstadual/filterByNomeEntidade?search=SOCIEDADE RECREATIVA ESPORTIVA

Para paginar a listagem de EnteDeclaradoUtilidaddePublicaEstadual incluir offset como objeto inicial e limit para a quantidade de objetos seguintes:
-> http://localhost:8081/desafio/getEntesDeclaradosUtilidadePublicaEstadualWithPagination?offset=1&limit=5

Para a execução dos testes automatizados basta inicializar acessando Run As > JUnit Test e acessar a janela para verificar o progresso;

Para acessar a documentação via browser o link será:
http://localhost:8081/api-docs

Para validar a Api via Swagger acessar o link a seguir no browser:
http://localhost:8081/swagger-ui/index.html

# Configurações necessárias
Instalar Spring Tools Suite;
Importar o projeto utilizando Gradle;
Configurar para que seja utilizado Java 11;
Se necessário executar o Gradle Refresh para que as dependencias sejam instalada;
