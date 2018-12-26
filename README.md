#grpc Example

Python Client & Java Server

On python Client Machine:
Install grpc libaries

python -m pip install --upgrade pip

python -m pip install grpcio

python -m pip install grpcio-tools

To generate Stub :
python -m grpc_tools.protoc -I <folder where proto file present> --python_out=<path of generated proto> --grpc_python_out=<grpc stub generated folder> protoFileNameIWithPath
  
python -m grpc_tools.protoc -I proto --python_out=src --grpc_python_out=src proto/HelloService.proto

On Java Server machine:

Download protoc-3.6.1-linux-x86_64 and protoc-gen-grpc-java-1.17.1-linux-x86_64.exe
https://github.com/protocolbuffers/protobuf/releases
http://central.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.17.1/

To generate Stub on server machine:
lib/protoc-3.6.1-linux-x86_64/bin/protoc -I proto --java_out javaserver/src/main/java proto/HelloService.proto --grpc_out javaserver/src/main/java --plugin=protoc-gen-grpc=lib/protoc-gen-grpc-java-1.17.1-linux-x86_64.exe

Note: To run exe on linux, install wine


