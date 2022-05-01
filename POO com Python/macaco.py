class Macaco():
    
    def __init__ (self, intNome, initEstomago):
        self.nome = intNome
        self.estomago = initEstomago
    
    def comer(self, alimento):
        self.estomago.append(alimento)
    
    def verEstomago(self):
        print(f"\nEstômago do(a) {self.nome}:")
        for alimentos in self.estomago:
            print(alimentos)

    def digerir(self):
        self.estomago.clear()


macaco1 = Macaco("Rafiki",[])
macaco2 = Macaco("Son Goku",[])

macaco1.comer("banana")
macaco1.comer("banana")
macaco2.comer("banana")
macaco1.verEstomago()
macaco2.verEstomago()
