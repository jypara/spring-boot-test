package hello.world.uniTest;

import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.*;
import java.sql.*;
import org.junit.jupiter.api.Test;
import org.junit.*;
import java.util.logging.*;
import java.lang.Object;
import static org.junit.jupiter.api.Assertions.*;
import javax.ws.rs.*;

public class DbConnectionTest {

    private static Logger logger 
            = Logger.getLogger( 
                DbConnectionTest.class.getName()); 

    private static Connection con;

    @Before
    public static void setUpClass() throws Exception{
        logger.info("Test started from DbConnectionTest...");
        con = null;
    }

    @Test
    public void testGetConnection() {
       when(con=null).thenThrow(new InternalServerErrorException("INTERNAL_ERROR"));
    }
}