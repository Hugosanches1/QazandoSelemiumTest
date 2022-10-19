# language: pt

  Funcionalidade: Receber o cupom de desconto da qazando
    Como usuário da qazando
    quero receber um cupom de desconto
    para cmprar um curso com valor reduzido

    @gerar-cupom
  Cenario: Visualizar código de desconto
    Dado que estou no site da qazando
    Quando preencho meu e-mail
    E clico em ganhar cupom
    Então eu vejo o código de desconto

      @teste-falha
  Cenário: Teste com falha
    Dado que tenho cupom gerado
    Quando eu falho