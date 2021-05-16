package minh.project.GrpcServer.Service;

import org.lognet.springboot.grpc.GRpcService;
import minh.project.Grpc.testGrpc;

//import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GRpcService
public class GrpcServer extends testGrpc.testImplBase {
    @Override
    public void rPC1(com.google.protobuf.Empty request,
                     io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        System.out.println("receive message");
    }
}
