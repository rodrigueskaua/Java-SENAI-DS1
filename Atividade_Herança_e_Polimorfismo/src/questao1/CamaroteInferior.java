package questao1;

public class CamaroteInferior extends VIP{
    String localizacao;

    public CamaroteInferior(double initValorIngresso, double initValorAdicional, String initLocalizacao ) {
        super(initValorIngresso, initValorAdicional);
        
        this.localizacao = initLocalizacao;
    }
    
    
    public void getLocalizacao(){
       System.out.println("Localização: "+ this.localizacao);
    }
    public void setLocalizacao(String newLocalizacao){
        this.localizacao = newLocalizacao;
    }
    
    
    public void informacoesIngresso(){
        System.out.printf("\nTipo: VIP - Camarote Inferior\nValor: R$%.2f\nLocalização: %s\n", this.ValorIngresso + this.ValorAdicional, this.localizacao);
    }
}
