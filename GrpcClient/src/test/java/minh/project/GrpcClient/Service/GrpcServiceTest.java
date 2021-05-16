package minh.project.GrpcClient.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrpcServiceTest {
    private GrpcService service= new GrpcService();
    @Test
    void run() {
        service.run();
    }
}