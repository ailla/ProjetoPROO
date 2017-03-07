import static org.junit.Assert.*;

import org.junit.Test;

import br.com.modelo.ProdutosDaLoja;

import junit.framework.TestCase;

public class ProdutosDaLojaTest extends TestCase {
	
	
	public void SetUp() throws Exception{

	}
	@Test
	public void testPermiteAdicionarProdutosNaLista() throws Exception{
		ProdutosDaLoja produtos = new ProdutosDaLoja();
		assertFalse(produtos.produtosExistentes(8));
		
	}
}