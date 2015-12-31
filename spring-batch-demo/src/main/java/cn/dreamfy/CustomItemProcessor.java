package cn.dreamfy;

import cn.dreamfy.model.Report;
import org.springframework.batch.item.ItemProcessor;

/**
 * CustomItemProcessor
 * Created by vicfu on 2015/12/30.
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report item) throws Exception {
        System.out.println("Processing..." + item);
        return item;
    }
}
