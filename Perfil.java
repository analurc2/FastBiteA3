package B_Pedido;
import A_MenuInicial.FastBite;

public class Perfil {

    public void abrirPerfil() {
        System.out.println("\n========================================");
        System.out.println("               MEU PERFIL             ");
        System.out.println("========================================");

        if (FastBite.usuarioCadastrado == null || FastBite.usuarioCadastrado.isEmpty()) {
            System.out.println("  Nenhum usuário cadastrado.");
        } else {
            System.out.println("   Usuário : " + FastBite.usuarioCadastrado);
            System.out.println("   Telefone: " + FastBite.telefoneCadastrado);
            System.out.println("   CEP     : " + FastBite.cepCadastrado);
            System.out.println("   Senha   : " + (FastBite.senhaCadastrada));
        }

        System.out.println("========================================\n");
    }
}
