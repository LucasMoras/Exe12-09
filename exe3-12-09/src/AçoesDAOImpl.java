
import java.util.HashMap;
import java.util.Map;

public interface AçoesDAO {
    void save(AçoesDAO contaDTO);
    AçoesDAO find(String tipo);
}

public class AçoesDAOImpl implements AçoesDAO {
    private Map<String, ContasDTO> contas = new HashMap<>();

    @Override
    public void save(ContasDTO contaDTO) {
        contas.put(contaDTO.getTipo(), contaDTO);
    }

    @Override
    public ContasDTO find(String tipo) {
        return contas.get(tipo);
    }
}


