class tv:
    def __init__(self,	volume,	numCanal):
        self.Canal = numCanal
        self.Volume = volume

    def setVolume(self, volume):
        self.Volume = 

    def saque(self,	valor):
        self.saldo -= valor


    def validarInput(min, max, nomeaux):    
        num = 0;
        while (num < min or num > max):
            num = int(input(f"Digite o número do {nomeaux}: "));
            if (num < min or num > max):
                print("ERRO!, Digite uma opção válida: ")

            return num;
tv1 = Tv("123-45", "Kauã")
conta.extrato()
conta.deposito(float(input("Valor do deposito: ")))
conta.extrato()



    