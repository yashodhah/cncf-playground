helm -n mydrugs upgrade order-service . --values=./values/order-service/values.yaml
helm -n mydrugs upgrade payment-service . --values=./values/payment-service/values.yaml

