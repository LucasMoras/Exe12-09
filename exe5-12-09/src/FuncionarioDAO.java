import java.util.HashMap;
import java.util.Map;

public interface FuncionarioDAO {
    void save(FuncionarioDTO funcionarioDTO);
    FuncionarioDTO find(String nome);
}

public class FuncionarioDAOImpl implements FuncionarioDAO {
    private Map<String, FuncionarioDTO> funcionarios = new HashMap<>();

    @Override
    public void save(FuncionarioDTO funcionarioDTO) {
        funcionarios.put(funcionarioDTO.getNome(), funcionarioDTO);
    }

    @Override
    public FuncionarioDTO find(String nome) {
        return funcionarios.get(nome);
    }
}
