package cn.dreamfy.example.ch01;

import cn.dreamfy.example.ch01.model.CreditBill;
import org.springframework.batch.item.ItemProcessor;

/**
 * CreditBillProcessor
 * Created by vicfu on 2015/12/30.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {

    @Override
    public CreditBill process(CreditBill item) throws Exception {
        System.out.println("Processing..." + item.toString());
        return item;
    }
}
