/**

 * Classe Usuario representa a interação do usuário com a SmartTv.

 * Ela contém o método main, onde são criadas instâncias da classe SmartTv e são chamados seus métodos.
 */
public class Usuario {
    /**

     * Método main é responsável por criar uma instância da classe SmartTv e chamar seus métodos.

     * Ele também imprime informações sobre o status da SmartTv.

     * @param args argumentos passados na execução do programa.

     * @throws Exception possíveis exceções geradas pelo uso dos métodos da classe SmartTv.
     */

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);



    }
}
