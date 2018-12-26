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


