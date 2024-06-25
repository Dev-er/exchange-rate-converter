Este projeto é um desafio feito pela Alura

para os alunos do ALURA/ONE - T6 - Backend

Conversor de Moedas

1. O que é?
Este desafio é uma atividade de fixação de conceitos teóricos e práticos desenvolvidos durante o curso.

2. Qual é o objetivo?
O principal objetivo é desenvolver uma aplicação que consuma uma 
API - Application Programming Interface (Interface de Programação de Aplicação) e,
possibilite ao usuário, converter até seis moedas de países diversos fazendo uso da
ferramenta que fornece a taxa de conversão do dia.

3. Como funciona esta aplicação?

- Consume a API (ExchangeRate-API) através da classe ApiConverter:
  - Análisa e Desserializa da Resposta JSON;
- Apresenta um menu de opções para escolha, da classe Menu:
  - Realiza a filtragem de moedas escolhidas pelo usuário;
- Quando executado a classe Principal, solicita ao usuário para escolher uma opção do Menu e a quantidade a ser convertida:
  - Apresenta os dados, moeda de referência, moeda que se deseja converter, a quantidade a ser convertida e a taxa de câmbio no momento da conversão;

4. Tecnologias utilizadas

- Linguagem de programação Java e Orientação a Objetos;
- Biblioteca Google Gson;
- API ExchangeRate-API;