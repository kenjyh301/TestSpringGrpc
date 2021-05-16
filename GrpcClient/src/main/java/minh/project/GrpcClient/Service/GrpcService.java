package minh.project.GrpcClient.Service;

import com.google.protobuf.Empty;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import minh.project.GrpcClient.Grpc.testGrpc;

public class GrpcService {
   public void run(){
        Channel channel= ManagedChannelBuilder.forTarget("127.0.0.1:5353").usePlaintext().build();
        testGrpc.testBlockingStub stub= testGrpc.newBlockingStub(channel);
//        Empty empty;
        stub.test(com.google.protobuf.Empty.getDefaultInstance());
    }
}
