# Default to /var/run/docker.sock
# helm install chaos-mesh chaos-mesh/chaos-mesh -n hlab --version 2.7.0
# helm install promethues prometheus-community/prometheus -n hlab --version 25.28.0
helm install grafana grafana/grafana -n hlab --version 8.5.1


