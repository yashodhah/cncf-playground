helm -n mydrugs upgrade order-service ../app --values=../app/values/order-service/values.yaml
helm -n mydrugs upgrade payment-service ../app --values=../app/values/payment-service/values.yaml

