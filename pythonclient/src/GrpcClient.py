from __future__ import print_function

import grpc

import HelloService_pb2
import HelloService_pb2_grpc

def run():
  
    channel = grpc.insecure_channel('localhost:8080'):
    stub = HelloService_pb2_grpc.HelloServiceStub(channel)
    response = stub.hello(HelloService_pb2.HelloRequest(firstName='shr', lastName='gupta'))
    print("Greeter client received: " + response.greeting)

if __name__ == '__main__':
    run()

