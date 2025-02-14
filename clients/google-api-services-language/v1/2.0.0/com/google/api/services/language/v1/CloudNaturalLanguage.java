/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.language.v1;

/**
 * Service definition for CloudNaturalLanguage (v1).
 *
 * <p>
 * Provides natural language understanding technologies, such as sentiment analysis, entity recognition, entity sentiment analysis, and other text annotations, to developers.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/natural-language/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudNaturalLanguageRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudNaturalLanguage extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        (com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1))) ||
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION >= 2,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "2.0.0 of the Cloud Natural Language API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://language.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://language.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudNaturalLanguage(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudNaturalLanguage(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Documents collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudNaturalLanguage language = new CloudNaturalLanguage(...);}
   *   {@code CloudNaturalLanguage.Documents.List request = language.documents().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Documents documents() {
    return new Documents();
  }

  /**
   * The "documents" collection of methods.
   */
  public class Documents {

    /**
     * Finds named entities (currently proper names and common nouns) in the text along with entity
     * types, salience, mentions for each entity, and other properties.
     *
     * Create a request for the method "documents.analyzeEntities".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link AnalyzeEntities#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.AnalyzeEntitiesRequest}
     * @return the request
     */
    public AnalyzeEntities analyzeEntities(com.google.api.services.language.v1.model.AnalyzeEntitiesRequest content) throws java.io.IOException {
      AnalyzeEntities result = new AnalyzeEntities(content);
      initialize(result);
      return result;
    }

    public class AnalyzeEntities extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.AnalyzeEntitiesResponse> {

      private static final String REST_PATH = "v1/documents:analyzeEntities";

      /**
       * Finds named entities (currently proper names and common nouns) in the text along with entity
       * types, salience, mentions for each entity, and other properties.
       *
       * Create a request for the method "documents.analyzeEntities".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link AnalyzeEntities#execute()} method to invoke the remote
       * operation. <p> {@link AnalyzeEntities#initialize(com.google.api.client.googleapis.services.Abst
       * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.AnalyzeEntitiesRequest}
       * @since 1.13
       */
      protected AnalyzeEntities(com.google.api.services.language.v1.model.AnalyzeEntitiesRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.AnalyzeEntitiesResponse.class);
      }

      @Override
      public AnalyzeEntities set$Xgafv(java.lang.String $Xgafv) {
        return (AnalyzeEntities) super.set$Xgafv($Xgafv);
      }

      @Override
      public AnalyzeEntities setAccessToken(java.lang.String accessToken) {
        return (AnalyzeEntities) super.setAccessToken(accessToken);
      }

      @Override
      public AnalyzeEntities setAlt(java.lang.String alt) {
        return (AnalyzeEntities) super.setAlt(alt);
      }

      @Override
      public AnalyzeEntities setCallback(java.lang.String callback) {
        return (AnalyzeEntities) super.setCallback(callback);
      }

      @Override
      public AnalyzeEntities setFields(java.lang.String fields) {
        return (AnalyzeEntities) super.setFields(fields);
      }

      @Override
      public AnalyzeEntities setKey(java.lang.String key) {
        return (AnalyzeEntities) super.setKey(key);
      }

      @Override
      public AnalyzeEntities setOauthToken(java.lang.String oauthToken) {
        return (AnalyzeEntities) super.setOauthToken(oauthToken);
      }

      @Override
      public AnalyzeEntities setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AnalyzeEntities) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AnalyzeEntities setQuotaUser(java.lang.String quotaUser) {
        return (AnalyzeEntities) super.setQuotaUser(quotaUser);
      }

      @Override
      public AnalyzeEntities setUploadType(java.lang.String uploadType) {
        return (AnalyzeEntities) super.setUploadType(uploadType);
      }

      @Override
      public AnalyzeEntities setUploadProtocol(java.lang.String uploadProtocol) {
        return (AnalyzeEntities) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AnalyzeEntities set(String parameterName, Object value) {
        return (AnalyzeEntities) super.set(parameterName, value);
      }
    }
    /**
     * Finds entities, similar to AnalyzeEntities in the text and analyzes sentiment associated with
     * each entity and its mentions.
     *
     * Create a request for the method "documents.analyzeEntitySentiment".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link AnalyzeEntitySentiment#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.AnalyzeEntitySentimentRequest}
     * @return the request
     */
    public AnalyzeEntitySentiment analyzeEntitySentiment(com.google.api.services.language.v1.model.AnalyzeEntitySentimentRequest content) throws java.io.IOException {
      AnalyzeEntitySentiment result = new AnalyzeEntitySentiment(content);
      initialize(result);
      return result;
    }

    public class AnalyzeEntitySentiment extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.AnalyzeEntitySentimentResponse> {

      private static final String REST_PATH = "v1/documents:analyzeEntitySentiment";

      /**
       * Finds entities, similar to AnalyzeEntities in the text and analyzes sentiment associated with
       * each entity and its mentions.
       *
       * Create a request for the method "documents.analyzeEntitySentiment".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link AnalyzeEntitySentiment#execute()} method to invoke the
       * remote operation. <p> {@link AnalyzeEntitySentiment#initialize(com.google.api.client.googleapis
       * .services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
       * after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.AnalyzeEntitySentimentRequest}
       * @since 1.13
       */
      protected AnalyzeEntitySentiment(com.google.api.services.language.v1.model.AnalyzeEntitySentimentRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.AnalyzeEntitySentimentResponse.class);
      }

      @Override
      public AnalyzeEntitySentiment set$Xgafv(java.lang.String $Xgafv) {
        return (AnalyzeEntitySentiment) super.set$Xgafv($Xgafv);
      }

      @Override
      public AnalyzeEntitySentiment setAccessToken(java.lang.String accessToken) {
        return (AnalyzeEntitySentiment) super.setAccessToken(accessToken);
      }

      @Override
      public AnalyzeEntitySentiment setAlt(java.lang.String alt) {
        return (AnalyzeEntitySentiment) super.setAlt(alt);
      }

      @Override
      public AnalyzeEntitySentiment setCallback(java.lang.String callback) {
        return (AnalyzeEntitySentiment) super.setCallback(callback);
      }

      @Override
      public AnalyzeEntitySentiment setFields(java.lang.String fields) {
        return (AnalyzeEntitySentiment) super.setFields(fields);
      }

      @Override
      public AnalyzeEntitySentiment setKey(java.lang.String key) {
        return (AnalyzeEntitySentiment) super.setKey(key);
      }

      @Override
      public AnalyzeEntitySentiment setOauthToken(java.lang.String oauthToken) {
        return (AnalyzeEntitySentiment) super.setOauthToken(oauthToken);
      }

      @Override
      public AnalyzeEntitySentiment setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AnalyzeEntitySentiment) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AnalyzeEntitySentiment setQuotaUser(java.lang.String quotaUser) {
        return (AnalyzeEntitySentiment) super.setQuotaUser(quotaUser);
      }

      @Override
      public AnalyzeEntitySentiment setUploadType(java.lang.String uploadType) {
        return (AnalyzeEntitySentiment) super.setUploadType(uploadType);
      }

      @Override
      public AnalyzeEntitySentiment setUploadProtocol(java.lang.String uploadProtocol) {
        return (AnalyzeEntitySentiment) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AnalyzeEntitySentiment set(String parameterName, Object value) {
        return (AnalyzeEntitySentiment) super.set(parameterName, value);
      }
    }
    /**
     * Analyzes the sentiment of the provided text.
     *
     * Create a request for the method "documents.analyzeSentiment".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link AnalyzeSentiment#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.AnalyzeSentimentRequest}
     * @return the request
     */
    public AnalyzeSentiment analyzeSentiment(com.google.api.services.language.v1.model.AnalyzeSentimentRequest content) throws java.io.IOException {
      AnalyzeSentiment result = new AnalyzeSentiment(content);
      initialize(result);
      return result;
    }

    public class AnalyzeSentiment extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.AnalyzeSentimentResponse> {

      private static final String REST_PATH = "v1/documents:analyzeSentiment";

      /**
       * Analyzes the sentiment of the provided text.
       *
       * Create a request for the method "documents.analyzeSentiment".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link AnalyzeSentiment#execute()} method to invoke the remote
       * operation. <p> {@link AnalyzeSentiment#initialize(com.google.api.client.googleapis.services.Abs
       * tractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.AnalyzeSentimentRequest}
       * @since 1.13
       */
      protected AnalyzeSentiment(com.google.api.services.language.v1.model.AnalyzeSentimentRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.AnalyzeSentimentResponse.class);
      }

      @Override
      public AnalyzeSentiment set$Xgafv(java.lang.String $Xgafv) {
        return (AnalyzeSentiment) super.set$Xgafv($Xgafv);
      }

      @Override
      public AnalyzeSentiment setAccessToken(java.lang.String accessToken) {
        return (AnalyzeSentiment) super.setAccessToken(accessToken);
      }

      @Override
      public AnalyzeSentiment setAlt(java.lang.String alt) {
        return (AnalyzeSentiment) super.setAlt(alt);
      }

      @Override
      public AnalyzeSentiment setCallback(java.lang.String callback) {
        return (AnalyzeSentiment) super.setCallback(callback);
      }

      @Override
      public AnalyzeSentiment setFields(java.lang.String fields) {
        return (AnalyzeSentiment) super.setFields(fields);
      }

      @Override
      public AnalyzeSentiment setKey(java.lang.String key) {
        return (AnalyzeSentiment) super.setKey(key);
      }

      @Override
      public AnalyzeSentiment setOauthToken(java.lang.String oauthToken) {
        return (AnalyzeSentiment) super.setOauthToken(oauthToken);
      }

      @Override
      public AnalyzeSentiment setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AnalyzeSentiment) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AnalyzeSentiment setQuotaUser(java.lang.String quotaUser) {
        return (AnalyzeSentiment) super.setQuotaUser(quotaUser);
      }

      @Override
      public AnalyzeSentiment setUploadType(java.lang.String uploadType) {
        return (AnalyzeSentiment) super.setUploadType(uploadType);
      }

      @Override
      public AnalyzeSentiment setUploadProtocol(java.lang.String uploadProtocol) {
        return (AnalyzeSentiment) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AnalyzeSentiment set(String parameterName, Object value) {
        return (AnalyzeSentiment) super.set(parameterName, value);
      }
    }
    /**
     * Analyzes the syntax of the text and provides sentence boundaries and tokenization along with part
     * of speech tags, dependency trees, and other properties.
     *
     * Create a request for the method "documents.analyzeSyntax".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link AnalyzeSyntax#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.AnalyzeSyntaxRequest}
     * @return the request
     */
    public AnalyzeSyntax analyzeSyntax(com.google.api.services.language.v1.model.AnalyzeSyntaxRequest content) throws java.io.IOException {
      AnalyzeSyntax result = new AnalyzeSyntax(content);
      initialize(result);
      return result;
    }

    public class AnalyzeSyntax extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.AnalyzeSyntaxResponse> {

      private static final String REST_PATH = "v1/documents:analyzeSyntax";

      /**
       * Analyzes the syntax of the text and provides sentence boundaries and tokenization along with
       * part of speech tags, dependency trees, and other properties.
       *
       * Create a request for the method "documents.analyzeSyntax".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link AnalyzeSyntax#execute()} method to invoke the remote
       * operation. <p> {@link AnalyzeSyntax#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.AnalyzeSyntaxRequest}
       * @since 1.13
       */
      protected AnalyzeSyntax(com.google.api.services.language.v1.model.AnalyzeSyntaxRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.AnalyzeSyntaxResponse.class);
      }

      @Override
      public AnalyzeSyntax set$Xgafv(java.lang.String $Xgafv) {
        return (AnalyzeSyntax) super.set$Xgafv($Xgafv);
      }

      @Override
      public AnalyzeSyntax setAccessToken(java.lang.String accessToken) {
        return (AnalyzeSyntax) super.setAccessToken(accessToken);
      }

      @Override
      public AnalyzeSyntax setAlt(java.lang.String alt) {
        return (AnalyzeSyntax) super.setAlt(alt);
      }

      @Override
      public AnalyzeSyntax setCallback(java.lang.String callback) {
        return (AnalyzeSyntax) super.setCallback(callback);
      }

      @Override
      public AnalyzeSyntax setFields(java.lang.String fields) {
        return (AnalyzeSyntax) super.setFields(fields);
      }

      @Override
      public AnalyzeSyntax setKey(java.lang.String key) {
        return (AnalyzeSyntax) super.setKey(key);
      }

      @Override
      public AnalyzeSyntax setOauthToken(java.lang.String oauthToken) {
        return (AnalyzeSyntax) super.setOauthToken(oauthToken);
      }

      @Override
      public AnalyzeSyntax setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AnalyzeSyntax) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AnalyzeSyntax setQuotaUser(java.lang.String quotaUser) {
        return (AnalyzeSyntax) super.setQuotaUser(quotaUser);
      }

      @Override
      public AnalyzeSyntax setUploadType(java.lang.String uploadType) {
        return (AnalyzeSyntax) super.setUploadType(uploadType);
      }

      @Override
      public AnalyzeSyntax setUploadProtocol(java.lang.String uploadProtocol) {
        return (AnalyzeSyntax) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AnalyzeSyntax set(String parameterName, Object value) {
        return (AnalyzeSyntax) super.set(parameterName, value);
      }
    }
    /**
     * A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and
     * analyzeSyntax provide in one call.
     *
     * Create a request for the method "documents.annotateText".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link AnnotateText#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.AnnotateTextRequest}
     * @return the request
     */
    public AnnotateText annotateText(com.google.api.services.language.v1.model.AnnotateTextRequest content) throws java.io.IOException {
      AnnotateText result = new AnnotateText(content);
      initialize(result);
      return result;
    }

    public class AnnotateText extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.AnnotateTextResponse> {

      private static final String REST_PATH = "v1/documents:annotateText";

      /**
       * A convenience method that provides all the features that analyzeSentiment, analyzeEntities, and
       * analyzeSyntax provide in one call.
       *
       * Create a request for the method "documents.annotateText".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link AnnotateText#execute()} method to invoke the remote
       * operation. <p> {@link
       * AnnotateText#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.AnnotateTextRequest}
       * @since 1.13
       */
      protected AnnotateText(com.google.api.services.language.v1.model.AnnotateTextRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.AnnotateTextResponse.class);
      }

      @Override
      public AnnotateText set$Xgafv(java.lang.String $Xgafv) {
        return (AnnotateText) super.set$Xgafv($Xgafv);
      }

      @Override
      public AnnotateText setAccessToken(java.lang.String accessToken) {
        return (AnnotateText) super.setAccessToken(accessToken);
      }

      @Override
      public AnnotateText setAlt(java.lang.String alt) {
        return (AnnotateText) super.setAlt(alt);
      }

      @Override
      public AnnotateText setCallback(java.lang.String callback) {
        return (AnnotateText) super.setCallback(callback);
      }

      @Override
      public AnnotateText setFields(java.lang.String fields) {
        return (AnnotateText) super.setFields(fields);
      }

      @Override
      public AnnotateText setKey(java.lang.String key) {
        return (AnnotateText) super.setKey(key);
      }

      @Override
      public AnnotateText setOauthToken(java.lang.String oauthToken) {
        return (AnnotateText) super.setOauthToken(oauthToken);
      }

      @Override
      public AnnotateText setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AnnotateText) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AnnotateText setQuotaUser(java.lang.String quotaUser) {
        return (AnnotateText) super.setQuotaUser(quotaUser);
      }

      @Override
      public AnnotateText setUploadType(java.lang.String uploadType) {
        return (AnnotateText) super.setUploadType(uploadType);
      }

      @Override
      public AnnotateText setUploadProtocol(java.lang.String uploadProtocol) {
        return (AnnotateText) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AnnotateText set(String parameterName, Object value) {
        return (AnnotateText) super.set(parameterName, value);
      }
    }
    /**
     * Classifies a document into categories.
     *
     * Create a request for the method "documents.classifyText".
     *
     * This request holds the parameters needed by the language server.  After setting any optional
     * parameters, call the {@link ClassifyText#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.language.v1.model.ClassifyTextRequest}
     * @return the request
     */
    public ClassifyText classifyText(com.google.api.services.language.v1.model.ClassifyTextRequest content) throws java.io.IOException {
      ClassifyText result = new ClassifyText(content);
      initialize(result);
      return result;
    }

    public class ClassifyText extends CloudNaturalLanguageRequest<com.google.api.services.language.v1.model.ClassifyTextResponse> {

      private static final String REST_PATH = "v1/documents:classifyText";

      /**
       * Classifies a document into categories.
       *
       * Create a request for the method "documents.classifyText".
       *
       * This request holds the parameters needed by the the language server.  After setting any
       * optional parameters, call the {@link ClassifyText#execute()} method to invoke the remote
       * operation. <p> {@link
       * ClassifyText#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.language.v1.model.ClassifyTextRequest}
       * @since 1.13
       */
      protected ClassifyText(com.google.api.services.language.v1.model.ClassifyTextRequest content) {
        super(CloudNaturalLanguage.this, "POST", REST_PATH, content, com.google.api.services.language.v1.model.ClassifyTextResponse.class);
      }

      @Override
      public ClassifyText set$Xgafv(java.lang.String $Xgafv) {
        return (ClassifyText) super.set$Xgafv($Xgafv);
      }

      @Override
      public ClassifyText setAccessToken(java.lang.String accessToken) {
        return (ClassifyText) super.setAccessToken(accessToken);
      }

      @Override
      public ClassifyText setAlt(java.lang.String alt) {
        return (ClassifyText) super.setAlt(alt);
      }

      @Override
      public ClassifyText setCallback(java.lang.String callback) {
        return (ClassifyText) super.setCallback(callback);
      }

      @Override
      public ClassifyText setFields(java.lang.String fields) {
        return (ClassifyText) super.setFields(fields);
      }

      @Override
      public ClassifyText setKey(java.lang.String key) {
        return (ClassifyText) super.setKey(key);
      }

      @Override
      public ClassifyText setOauthToken(java.lang.String oauthToken) {
        return (ClassifyText) super.setOauthToken(oauthToken);
      }

      @Override
      public ClassifyText setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (ClassifyText) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public ClassifyText setQuotaUser(java.lang.String quotaUser) {
        return (ClassifyText) super.setQuotaUser(quotaUser);
      }

      @Override
      public ClassifyText setUploadType(java.lang.String uploadType) {
        return (ClassifyText) super.setUploadType(uploadType);
      }

      @Override
      public ClassifyText setUploadProtocol(java.lang.String uploadProtocol) {
        return (ClassifyText) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public ClassifyText set(String parameterName, Object value) {
        return (ClassifyText) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link CloudNaturalLanguage}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudNaturalLanguage}. */
    @Override
    public CloudNaturalLanguage build() {
      return new CloudNaturalLanguage(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudNaturalLanguageRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudNaturalLanguageRequestInitializer(
        CloudNaturalLanguageRequestInitializer cloudnaturallanguageRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudnaturallanguageRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
