package combini.dao;

import java.util.List;

import combini.vo.Join;

public interface SaleProductsMapper {

	// ���� ��ǰ ��ȸ
	public List<Join> selectSaleProducts(String saleDate);

}
