class Conta:
    def __init__(self,	numero,	titular):
        self.numero = numero
        self.titular = titular
        self.saldo = 0

    def deposito(self,	valor):
        self.saldo += valor

    def saque(self,	valor):
        self.saldo -= valor


    def extrato(self):
        print(f"titular: {self.titular}\nnumero: {self.numero}\nsaldo: {self.saldo}\n")

conta = Conta("123-45", "Kauã")
conta.extrato()
conta.deposito(float(input("Valor do deposito: ")))
conta.extrato()
