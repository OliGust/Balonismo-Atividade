public class Main {
    public static void main(String[] args) {
        //criar objetos do passeio
        Pessoa p1;
        Pessoa p2;
        Piloto pilo1;
        Balao b1;

        //Informações P1
        p1 = new Pessoa();

        p1.nome = "Elliot Silva";
        p1.CPF = "12345678969";
        p1.RG = "125689427";
        p1.telefone = "11954633757";
        p1.telefoneEmergencia = "11955281414";
        p1.termoCienciaRisco = true;

        //Endereço P1
        p1.rua = "Rua das flores";
        p1.numero = "69";
        p1.bairro = "Vila Helena";
        p1.cidade = "Jandira";
        p1.estado = "São Paulo";


        //Informações P2
        p2 = new Pessoa();

        p2.nome = "Vênus Silva";
        p2.CPF = "47748756832";
        p2.RG = "562384697";
        p2.telefone = "11932784422";
        p2.telefoneEmergencia = "11955281414";
        p2.termoCienciaRisco = true;

        //Endereço P2
        p2.rua = "Rua das flores";
        p2.numero = "69";
        p2.bairro = "Vila Helena";
        p2.cidade = "Jandira";
        p2.estado = "São Paulo";

        //Piloto
        pilo1 = new Piloto();

        pilo1.nomePiloto = "Jeferson Araujo";
        pilo1.CPF = "22367859433";
        pilo1.registroANAC = "235468";

        //Balão
        b1 = new Balao();
        b1.numIdentificacao = "5900";

    }
}