/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.AdmissionregistrationV1beta1ServiceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookClientConfig contains the information to make a TLS connection with the webhook
 */
@ApiModel(description = "WebhookClientConfig contains the information to make a TLS connection with the webhook")

public class V1beta1WebhookClientConfig {
  @SerializedName("caBundle")
  private byte[] caBundle = null;

  @SerializedName("service")
  private AdmissionregistrationV1beta1ServiceReference service = null;

  @SerializedName("url")
  private String url = null;

  public V1beta1WebhookClientConfig caBundle(byte[] caBundle) {
    this.caBundle = caBundle;
    return this;
  }

   /**
   * &#x60;caBundle&#x60; is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate. Required.
   * @return caBundle
  **/
  @ApiModelProperty(required = true, value = "`caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. Required.")
  public byte[] getCaBundle() {
    return caBundle;
  }

  public void setCaBundle(byte[] caBundle) {
    this.caBundle = caBundle;
  }

  public V1beta1WebhookClientConfig service(AdmissionregistrationV1beta1ServiceReference service) {
    this.service = service;
    return this;
  }

   /**
   * &#x60;service&#x60; is a reference to the service for this webhook. Either &#x60;service&#x60; or &#x60;url&#x60; must be specified.  If the webhook is running within the cluster, then you should use &#x60;service&#x60;.  Port 443 will be used if it is open, otherwise it is an error.
   * @return service
  **/
  @ApiModelProperty(value = "`service` is a reference to the service for this webhook. Either `service` or `url` must be specified.  If the webhook is running within the cluster, then you should use `service`.  Port 443 will be used if it is open, otherwise it is an error.")
  public AdmissionregistrationV1beta1ServiceReference getService() {
    return service;
  }

  public void setService(AdmissionregistrationV1beta1ServiceReference service) {
    this.service = service;
  }

  public V1beta1WebhookClientConfig url(String url) {
    this.url = url;
    return this;
  }

   /**
   * &#x60;url&#x60; gives the location of the webhook, in standard URL form (&#x60;[scheme://]host:port/path&#x60;). Exactly one of &#x60;url&#x60; or &#x60;service&#x60; must be specified.  The &#x60;host&#x60; should not refer to a service running in the cluster; use the &#x60;service&#x60; field instead. The host might be resolved via external DNS in some apiservers (e.g., &#x60;kube-apiserver&#x60; cannot resolve in-cluster DNS as that would be a layering violation). &#x60;host&#x60; may also be an IP address.  Please note that using &#x60;localhost&#x60; or &#x60;127.0.0.1&#x60; as a &#x60;host&#x60; is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \&quot;https\&quot;; the URL must begin with \&quot;https://\&quot;.  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \&quot;user:password@\&quot; is not allowed. Fragments (\&quot;#...\&quot;) and query parameters (\&quot;?...\&quot;) are not allowed, either.
   * @return url
  **/
  @ApiModelProperty(value = "`url` gives the location of the webhook, in standard URL form (`[scheme://]host:port/path`). Exactly one of `url` or `service` must be specified.  The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.  Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.  The scheme must be \"https\"; the URL must begin with \"https://\".  A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.  Attempting to use a user or basic auth e.g. \"user:password@\" is not allowed. Fragments (\"#...\") and query parameters (\"?...\") are not allowed, either.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WebhookClientConfig v1beta1WebhookClientConfig = (V1beta1WebhookClientConfig) o;
    return Objects.equals(this.caBundle, v1beta1WebhookClientConfig.caBundle) &&
        Objects.equals(this.service, v1beta1WebhookClientConfig.service) &&
        Objects.equals(this.url, v1beta1WebhookClientConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caBundle, service, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WebhookClientConfig {\n");
    
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

