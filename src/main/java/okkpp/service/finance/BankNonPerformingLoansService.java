package okkpp.service.finance;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.dao.finance.BankNonPerformingLoansMapper;
import okkpp.model.finance.BankNonPerformingLoans;
import okkpp.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月7日 上午10:43:36
*/
@Service
@Transactional
public class BankNonPerformingLoansService {

	@Autowired
	BankNonPerformingLoansMapper mapper;
	public List<BankNonPerformingLoans> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(BankNonPerformingLoans.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<BankNonPerformingLoans> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(BankNonPerformingLoans.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<BankNonPerformingLoans> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// BankNonPerformingLoans更新
	public int updateBankNonPerformingLoans(BankNonPerformingLoans bankNonPerformingLoans) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(bankNonPerformingLoans);
	}

	// BankNonPerformingLoans插入
	public int insertBankNonPerformingLoans(BankNonPerformingLoans bankNonPerformingLoans) {
		return mapper.insertSelective(bankNonPerformingLoans);
	}

	// BankNonPerformingLoansl删除
	public int deleteBankNonPerformingLoans(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
