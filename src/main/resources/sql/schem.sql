-- used in tests that use HSQL
create table oauth_client_details (
  client_id VARCHAR(256) PRIMARY KEY,
  resource_ids VARCHAR(256),
  client_secret VARCHAR(256),
  scope VARCHAR(256),
  authorized_grant_types VARCHAR(256),
  web_server_redirect_uri VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additional_information VARCHAR(4096),
  autoapprove VARCHAR(256)
);
COMMENT ON COLUMN oauth_client_details.client_id IS '主键,必须唯一,不能为空';
COMMENT ON COLUMN oauth_client_details.resource_ids IS '客户端所能访问的资源id集合';
COMMENT ON COLUMN oauth_client_details.client_secret IS '用于指定客户端(client)的访问密匙';
COMMENT ON COLUMN oauth_client_details.scope IS '指定客户端申请的权限范围,可选值包括read,write,trust';
COMMENT ON COLUMN oauth_client_details.authorized_grant_types IS '指定客户端支持的grant_type,可选值包括authorization_code,password,refresh_token,implicit,client_credentials';
COMMENT ON COLUMN oauth_client_details.web_server_redirect_uri IS '客户端的重定向URI,可为空';
COMMENT ON COLUMN oauth_client_details.authorities IS '指定客户端所拥有的Spring Security的权限值,可选';
COMMENT ON COLUMN oauth_client_details.access_token_validity IS '设定客户端的access_token的有效时间值(单位:秒),可选, 若不设定值则使用默认的有效时间值(60 * 60 * 12, 12小时)';
COMMENT ON COLUMN oauth_client_details.refresh_token_validity IS '设定客户端的refresh_token的有效时间值(单位:秒),可选, 若不设定值则使用默认的有效时间值(60 * 60 * 24 * 30, 30天)';
COMMENT ON COLUMN oauth_client_details.additional_information IS '这是一个预留的字段,在Oauth的流程中没有实际的使用,可选';
COMMENT ON COLUMN oauth_client_details.autoapprove IS '设置用户是否自动Approval操作';

create table oauth_client_token (
  token_id VARCHAR(256),
  token BYTEA,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256)
);
COMMENT ON COLUMN oauth_client_token.token_id IS '从服务器端获取到的access_token的值.';
COMMENT ON COLUMN oauth_client_token.token IS '这是一个二进制的字段, 存储的数据是OAuth2AccessToken.java对象序列化后的二进制数据.';
COMMENT ON COLUMN oauth_client_token.authentication_id IS '该字段具有唯一性, 是根据当前的username(如果有),client_id与scope通过MD5加密生成的';
COMMENT ON COLUMN oauth_client_token.user_name IS '登录时的用户名';
COMMENT ON COLUMN oauth_client_token.client_id IS '客服端id';

create table oauth_access_token (
  token_id VARCHAR(256),
  token BYTEA,
  authentication_id VARCHAR(256) PRIMARY KEY,
  user_name VARCHAR(256),
  client_id VARCHAR(256),
  authentication BYTEA,
  refresh_token VARCHAR(256)
);
COMMENT ON COLUMN oauth_access_token.token_id IS '该字段的值是将access_token的值通过MD5加密后存储的';
COMMENT ON COLUMN oauth_access_token.token IS '同oauth_client_token表';
COMMENT ON COLUMN oauth_access_token.authentication_id IS '同oauth_client_token表';
COMMENT ON COLUMN oauth_access_token.user_name IS '同oauth_client_token表';
COMMENT ON COLUMN oauth_access_token.client_id IS '同oauth_client_token表';
COMMENT ON COLUMN oauth_access_token.authentication IS '存储将OAuth2Authentication.java对象序列化后的二进制数据.';
COMMENT ON COLUMN oauth_access_token.refresh_token IS '该字段的值是将refresh_token的值通过MD5加密后存储的.';

create table oauth_refresh_token (
  token_id VARCHAR(256),
  token BYTEA,
  authentication BYTEA
);

create table oauth_code (
  code VARCHAR(256), authentication BYTEA
);

create table oauth_approvals (
  userId VARCHAR(256),
  clientId VARCHAR(256),
  scope VARCHAR(256),
  status VARCHAR(10),
  expiresAt TIMESTAMP,
  lastModifiedAt TIMESTAMP
);


-- customized oauth_client_details table
create table ClientDetails (
  appId VARCHAR(256) PRIMARY KEY,
  resourceIds VARCHAR(256),
  appSecret VARCHAR(256),
  scope VARCHAR(256),
  grantTypes VARCHAR(256),
  redirectUrl VARCHAR(256),
  authorities VARCHAR(256),
  access_token_validity INTEGER,
  refresh_token_validity INTEGER,
  additionalInformation VARCHAR(4096),
  autoApproveScopes VARCHAR(256)
);

-- drop table ClientDetails;
-- drop table oauth_approvals;
-- drop table oauth_code;
-- drop table oauth_refresh_token;
-- drop table oauth_access_token;
-- drop table oauth_client_token;
-- drop table oauth_client_details;
