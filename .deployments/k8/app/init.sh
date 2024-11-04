helm -n mydrugs install order-service . --values=./values/order-service/values.yaml
helm -n mydrugs install payment-service . --values=./values/payment-service/values.yaml

