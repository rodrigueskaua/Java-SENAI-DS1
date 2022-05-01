class Quadrado():

    def __init__(self, initLado):
        self.lado = initLado

    def getLado(self):
        return self.lado
    
    def setLado(self, novoLado):
        self.lado = novoLado
    def calcularArea(self):
        return self.lado**2
quadrado = Quadrado(int(input("Digite o tamanho que deseja para o quadrado: ")))
print("a area do quadrado é: ", quadrado.calcularArea())



