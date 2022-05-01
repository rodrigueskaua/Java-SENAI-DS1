class Retangulo():
    def __init__(self, initBase, initAltura):
        self.Altura = initAltura
        self.Base = initBase
    
    def setAltura(self, novaAltura):
        self.Altura = novaAltura

    def setBase(self, novaBase):
        self.Base = novaBase
    
    def getAltura(self):
        return self.Altura
   
    def getBase(self):
        return self.Base
    
    def calcularArea(self):
        return self.Base * self.Altura

    def calcularPerimetro(self):
        return (self.Base + self.Altura )* 2


Retangulo1 = Retangulo(7,2)
print("a area do retangulo é: ", Retangulo1.calcularArea())
print("o perimetro é: ", Retangulo1.calcularPerimetro())
Retangulo1.setAltura(5)
Retangulo1.setBase(5)
print("a area do retangulo é: ", Retangulo1.calcularArea())
print("o perimetro é: ", Retangulo1.calcularPerimetro())


