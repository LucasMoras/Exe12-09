import java.util.HashMap;
import java.util.Map;

public interface PagamentoDAO {
    void save(PagamentoDTO pagamentoDTO);
    PagamentoDTO find(String tipo);
}

public class PagamentoDAOImpl implements PagamentoDAO {
    private Map<String, PagamentoDTO> pagamentos = new HashMap<>();

    @Override
    public void save(PagamentoDTO pagamentoDTO) {
        pagamentos.put(pagamentoDTO.getTipo(), pagamentoDTO);
    }

    @Override
    public PagamentoDTO find(String tipo) {
        return pagamentos.get(tipo);
    }
}
