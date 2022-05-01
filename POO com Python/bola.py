

class Bola():
    def __init__(self, initCor):
        self.cor = initCor

    def getCor(self):
        return self.cor

    def setCor(self, novaCor):
        self.cor = novaCor

bolagato = Bola("laranja")

bolagato.setCor(input("Digite a cor que deseja para a bola: "))
print("A bola foi pintada da cor: ", bolagato.getCor())

        