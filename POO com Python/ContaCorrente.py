"""Faça uma classe contaInvestimento que seja semelhante a classe contaCorrente, com a diferença de que se adicione um atributo taxaJuros. Forneça um método adicioneJuros (sem parametro explicito) que adicione juros a conta. Em seguida escreva um programa que construa uma poupança com saldo inicial de 1000 reais e uma taxa de juros de 10%. Depois aplique o método adicioneJuros() cinco vezes e imprime o saldo resultante."""

class contaInvestimento:
    def __init__(self,	numero,	titular, saldo, taxaJuros):
        self.numero = numero
        self.titular = titular
        self.saldo = saldo
        self.juros = taxaJuros

    def deposito(self,	valor):
        self.saldo += valor

    def saque(self,	valor):
        self.saldo -= valor

    def setJuros(self, juros):
        self.juros = juros
    def adicioneJuros(self):
        self.saldo += self.saldo * (self.juros/100) 
    def extrato(self):
        print(f"Titular: {self.titular}\nNumero: {self.numero}\nSaldo: R${self.saldo:.2f}\nTaxa de juros: {self.juros}%\n")

conta = contaInvestimento("123-45", "Kauã", 1000, 10)
conta.extrato()
conta.adicioneJuros()
conta.adicioneJuros()
conta.adicioneJuros()
conta.adicioneJuros()
conta.adicioneJuros()
conta.extrato()
