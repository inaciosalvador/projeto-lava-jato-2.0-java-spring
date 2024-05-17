# projeto-lava-jato-2.0-java-spring

## Autor
inacio salvador

## Data
May 2023

Projeto Lava-Jato 2.0 - Nova Versão em Spring Boot

Este projeto representa a continuação e evolução do Projeto Lava-Jato 2.0, um sistema inicialmente desenvolvido utilizando a linguagem de programação Java pura. Agora, nesta nova versão, o objetivo é reproduzir o mesmo fluxo de negócio, porém empregando o framework Spring Boot, uma solução amplamente utilizada no desenvolvimento de aplicações web em Java.

Com o Spring Boot, a nova versão do Projeto Lava-Jato 2.0 será implementada como uma aplicação web, com integração a um banco de dados PostgreSQL para armazenamento dos dados. O projeto visa aproveitar os recursos e melhores práticas oferecidos pelo Spring Boot, criando uma solução robusta, escalável e de alta qualidade.

O processo de atendimento ao cliente no Lava-Jato ocorre da seguinte forma:

1. **Recepção e Verificação de Cadastro**:
   - O cliente chega ao Lava-Jato sem necessidade de agendamento prévio.
   - Ao se dirigir à recepção, o cliente solicita os serviços desejados.
   - A atendente verifica se o cliente já possui cadastro, solicitando o CPF/CNPJ.
   - Caso o cliente não possua cadastro, a atendente realiza o seu cadastramento no momento, solicitando as seguintes informações: [NOME, TELEFONE, CPF OU CNPJ, PLACA DO CARRO, MODELO E FABRICANTE]. Dessa forma, o cliente pode ter mais de um veículo associado ao seu cadastro.

2. **Seleção de Serviços e Emissão da Ordem de Serviço (OS)**:
   - Se o cliente já possuir cadastro, a atendente seleciona os serviços que ele deseja.
   - Em seguida, a atendente imprime uma Ordem de Serviço (OS) e encaminha o cliente para a área de operações.

3. **Realização dos Serviços**:
   - Ao chegar na área de operações, os serviços solicitados são realizados.
   - Caso haja alguma alteração na OS, o responsável pela operação sinaliza a atendente para que as devidas alterações sejam feitas no "pedido".

4. **Pagamento e Liberação**:
   - Ao final da execução dos serviços, o cliente é direcionado ao caixa para efetuar o pagamento.
   - Após o pagamento, o cliente é liberado.

Esse processo permite que os clientes do Lava-Jato sejam atendidos de maneira ágil e eficiente, sem a necessidade de agendamento prévio. O cadastro do cliente e a emissão da OS garantem a organização e o acompanhamento dos serviços realizados.


### Diagrama de Classes


![classes](https://github.com/inaciosalvador/projeto-lava-jato-2.0-java-spring/assets/112987249/36e74b7f-0a7f-4633-bfed-dc37ce3d8619)





### Modelagem Conceitual

![conceitualsimplificadopng](https://github.com/inaciosalvador/projeto-lava-jato-2.0-java-spring/assets/112987249/e4bc5454-8935-4208-9d9b-7cdede100960)


### Modelagem Logica

![logicosimplificado](https://github.com/inaciosalvador/projeto-lava-jato-2.0-java-spring/assets/112987249/f43ace66-bd53-498c-a504-aa21d2fd1aee)





