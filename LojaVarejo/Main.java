package LojaVarejo;

public class Main {

    public static void main(String[] args) {
        Clientes cli1 = new Clientes();
        Vendedores vend1 = new Vendedores();
        Fornecedores forn1 = new Fornecedores();
        Produtos prod1 = new Produtos();
        Vendas vende1 = new Vendas();
        Estoque esto1= new Estoque();
        Transportadora tran1 = new Transportadora();

        cli1.cliente1 = "Clemir";
        cli1.cliente2 = "Andrei";
        cli1.cliente3 = "Anderson";

        vend1.vendedor1 = "Lucas";
        vend1.vendedor2 = "Fernando";
        vend1.vendedor3 = "Paulo";

        prod1.produto1 = "tenis";
        prod1.produto2 = "chuteira";
        prod1.produto3 = "bota";

        forn1.fornecedor1 = "Nike";
        forn1.fornecedor2 = "Adidas";
        forn1.fornecedor3 = "Umbro";

        esto1.estoque1 = "azul";
        esto1.estoque2 = "vermelha";
        esto1.estoque3 = "preta";

        vende1.venda1 = "online";
        vende1.venda2 = "ligação";

        tran1.transportadora1 = "Correios";
        tran1.transportadora2 = "JadLog";
        tran1.transportadora3 = "São Miguel";

        System.out.printf("O %s comprou com o vendedor %s um %s %s %s comprado %s entregue pelos %s\n",
        cli1.cliente1,vend1.vendedor1,prod1.produto1,forn1.fornecedor1,esto1.estoque1,vende1.venda1,tran1.transportadora1);
        System.out.printf("O %s comprou com o vendedor %s uma %s %s %s comprada por %s entregue pela %s\n",
        cli1.cliente2,vend1.vendedor2,prod1.produto2,forn1.fornecedor2,esto1.estoque2,vende1.venda2,tran1.transportadora2);
        System.out.printf("O %s comprou com o vendedor %s uma %s %s %s comprada %s entregue pela %s\n",
        cli1.cliente3,vend1.vendedor3,prod1.produto3,forn1.fornecedor3,esto1.estoque3,vende1.venda1,tran1.transportadora3);
    }
}
