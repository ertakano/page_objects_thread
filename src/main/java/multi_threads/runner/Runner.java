package multi_threads.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import multi_threads.tests.ValidarConsultasEmPrecosPrazos;

@RunWith(Suite.class)
@SuiteClasses({ValidarConsultasEmPrecosPrazos.class
})

public class Runner {

}
