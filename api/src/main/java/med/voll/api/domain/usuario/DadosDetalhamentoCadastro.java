package med.voll.api.domain.usuario;

public record DadosDetalhamentoCadastro(

        Long id,
        String login,
        String senha

) {
    public DadosDetalhamentoCadastro(Usuario usuario) {
        this(usuario.getId(), usuario.getLogin(), usuario.getSenha());
    }
}
