/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.
 */
@ApiModel(description = "ConfigMapNodeConfigSource contains the information to reference a ConfigMap as a config source for the Node.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class V1ConfigMapNodeConfigSource {
  public static final String SERIALIZED_NAME_KUBELET_CONFIG_KEY = "kubeletConfigKey";
  @SerializedName(SERIALIZED_NAME_KUBELET_CONFIG_KEY)
  private String kubeletConfigKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public V1ConfigMapNodeConfigSource kubeletConfigKey(String kubeletConfigKey) {
    
    this.kubeletConfigKey = kubeletConfigKey;
    return this;
  }

   /**
   * KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.
   * @return kubeletConfigKey
  **/
  @ApiModelProperty(required = true, value = "KubeletConfigKey declares which key of the referenced ConfigMap corresponds to the KubeletConfiguration structure This field is required in all cases.")

  public String getKubeletConfigKey() {
    return kubeletConfigKey;
  }


  public void setKubeletConfigKey(String kubeletConfigKey) {
    this.kubeletConfigKey = kubeletConfigKey;
  }


  public V1ConfigMapNodeConfigSource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the metadata.name of the referenced ConfigMap. This field is required in all cases.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1ConfigMapNodeConfigSource namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "Namespace is the metadata.namespace of the referenced ConfigMap. This field is required in all cases.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1ConfigMapNodeConfigSource resourceVersion(String resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ResourceVersion is the metadata.ResourceVersion of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")

  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1ConfigMapNodeConfigSource uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID is the metadata.UID of the referenced ConfigMap. This field is forbidden in Node.Spec, and required in Node.Status.")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ConfigMapNodeConfigSource v1ConfigMapNodeConfigSource = (V1ConfigMapNodeConfigSource) o;
    return Objects.equals(this.kubeletConfigKey, v1ConfigMapNodeConfigSource.kubeletConfigKey) &&
        Objects.equals(this.name, v1ConfigMapNodeConfigSource.name) &&
        Objects.equals(this.namespace, v1ConfigMapNodeConfigSource.namespace) &&
        Objects.equals(this.resourceVersion, v1ConfigMapNodeConfigSource.resourceVersion) &&
        Objects.equals(this.uid, v1ConfigMapNodeConfigSource.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeletConfigKey, name, namespace, resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ConfigMapNodeConfigSource {\n");
    sb.append("    kubeletConfigKey: ").append(toIndentedString(kubeletConfigKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

