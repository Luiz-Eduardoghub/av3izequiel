public class Principal {
    public static void main(String[] args) {
        SimuladorSistemaArquivos fs = new SimuladorSistemaArquivos();

        // Operações de exemplo
        fs.criarDiretorio("/raiz", "documentos");
        fs.criarArquivo("/raiz/documentos", "arquivo1.txt");
        fs.listarArquivos("/raiz");
        fs.listarArquivos("/raiz/documentos");

        fs.renomearArquivo("/raiz/documentos", "arquivo1.txt", "arquivo2.txt");
        fs.listarArquivos("/raiz/documentos");

        fs.deletarArquivo("/raiz/documentos", "arquivo2.txt");
        fs.listarArquivos("/raiz/documentos");

        fs.renomearDiretorio("/raiz", "documentos", "docs");
        fs.listarArquivos("/raiz");

        fs.deletarDiretorio("/raiz", "docs");
        fs.listarArquivos("/raiz");

        // Exibir o log do Journal
        System.out.println("\nRegistro do Jornal:");
        for (String entrada : fs.getJournal().getEntradas()) {
            System.out.println(entrada);
        }
    }
}
