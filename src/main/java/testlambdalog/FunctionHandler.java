package testlambdalog;

import com.amazonaws.services.lambda.runtime.Context;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FunctionHandler {

    static final Logger LOGGER = LogManager.getLogger(FunctionHandler.class);

    public DummyPojo handler(Context context) {
        LOGGER.info("Lambda function was called and logs with log4j2!");

        DummyPojo pojo = new DummyPojo();
        pojo.setValue("Oh please help!");
        return pojo;
    }
}
