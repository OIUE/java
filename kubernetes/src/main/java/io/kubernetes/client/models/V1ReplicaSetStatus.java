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
import io.kubernetes.client.models.V1ReplicaSetCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReplicaSetStatus represents the current status of a ReplicaSet.
 */
@ApiModel(description = "ReplicaSetStatus represents the current status of a ReplicaSet.")

public class V1ReplicaSetStatus {
  @SerializedName("availableReplicas")
  private Integer availableReplicas = null;

  @SerializedName("conditions")
  private List<V1ReplicaSetCondition> conditions = null;

  @SerializedName("fullyLabeledReplicas")
  private Integer fullyLabeledReplicas = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  public V1ReplicaSetStatus availableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
    return this;
  }

   /**
   * The number of available replicas (ready for at least minReadySeconds) for this replica set.
   * @return availableReplicas
  **/
  @ApiModelProperty(value = "The number of available replicas (ready for at least minReadySeconds) for this replica set.")
  public Integer getAvailableReplicas() {
    return availableReplicas;
  }

  public void setAvailableReplicas(Integer availableReplicas) {
    this.availableReplicas = availableReplicas;
  }

  public V1ReplicaSetStatus conditions(List<V1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public V1ReplicaSetStatus addConditionsItem(V1ReplicaSetCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<V1ReplicaSetCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Represents the latest available observations of a replica set&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Represents the latest available observations of a replica set's current state.")
  public List<V1ReplicaSetCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<V1ReplicaSetCondition> conditions) {
    this.conditions = conditions;
  }

  public V1ReplicaSetStatus fullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
    return this;
  }

   /**
   * The number of pods that have labels matching the labels of the pod template of the replicaset.
   * @return fullyLabeledReplicas
  **/
  @ApiModelProperty(value = "The number of pods that have labels matching the labels of the pod template of the replicaset.")
  public Integer getFullyLabeledReplicas() {
    return fullyLabeledReplicas;
  }

  public void setFullyLabeledReplicas(Integer fullyLabeledReplicas) {
    this.fullyLabeledReplicas = fullyLabeledReplicas;
  }

  public V1ReplicaSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "ObservedGeneration reflects the generation of the most recently observed ReplicaSet.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public V1ReplicaSetStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * The number of ready replicas for this replica set.
   * @return readyReplicas
  **/
  @ApiModelProperty(value = "The number of ready replicas for this replica set.")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public V1ReplicaSetStatus replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ReplicaSetStatus v1ReplicaSetStatus = (V1ReplicaSetStatus) o;
    return Objects.equals(this.availableReplicas, v1ReplicaSetStatus.availableReplicas) &&
        Objects.equals(this.conditions, v1ReplicaSetStatus.conditions) &&
        Objects.equals(this.fullyLabeledReplicas, v1ReplicaSetStatus.fullyLabeledReplicas) &&
        Objects.equals(this.observedGeneration, v1ReplicaSetStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, v1ReplicaSetStatus.readyReplicas) &&
        Objects.equals(this.replicas, v1ReplicaSetStatus.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ReplicaSetStatus {\n");
    
    sb.append("    availableReplicas: ").append(toIndentedString(availableReplicas)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    fullyLabeledReplicas: ").append(toIndentedString(fullyLabeledReplicas)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

