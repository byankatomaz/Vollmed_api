package med.voll.api.domain.usuario;

import java.security.SecureRandom;

public record DadosAutenticacao(
        String login,
        String senha
) {
}
