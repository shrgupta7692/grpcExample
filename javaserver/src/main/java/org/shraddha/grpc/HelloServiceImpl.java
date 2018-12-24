package org.baeldung.grpc.server;

import io.grpc.stub.StreamObserver;
import org.baeldung.grpc.HelloServiceGrpc;
import org.baeldung.grpc.HelloServiceOuterClass;

public class HelloServiceImpl  extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(
            HelloServiceOuterClass.HelloRequest request,
            StreamObserver<HelloServiceOuterClass.HelloResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloServiceOuterClass.HelloResponse response = HelloServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
