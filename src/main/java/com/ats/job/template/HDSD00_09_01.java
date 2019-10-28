package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 入院评估记录子集
 */
public class HDSD00_09_01 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_09_01(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <!-- 文档信息模型类别-标识符 HL7注册模型的编码系统OID -->\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <!-- 文档模板的根OID -->\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.43\"/>\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "  <!-- 中国卫生信息开放系统互连对象标识OID分配表  表D.4　固定对象OID分配 2.16.156.10011.2.4-->\n" +
                        "  <!-- 卫生信息共享文档分类编码系统OID  表A.1  卫生信息共享文档分类编码系 -->\n" +
                        "  <code code=\"C0023\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <!--修改title-->\n" +
                        "  <title>入院评估</title>\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "  <!-- 文档密级 　表C.3  ClinicalDocument.confidentialityCode值域表 (CWE) -->\n" +
                        "  <confidentialityCode code=\"N\" displayName=\"正常访问保密级别\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\"/>\n" +
                        "  <!-- 文档语言 表达文档采用的语言 代码值取HL7内部编码系统codeSystem = \"2.16.840.1.113883.6.121\". 人类语言编码系统 -->\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <!--文档集-标识符 该属性用于维护一份连续更新的文档，创建一个统一的文档集合标识符 -->\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <!--文档记录对象 用于表达此文档的患者信息 -->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!-- DE01.00.021.00  健康卡号-->\n" +
                        "      <id root=\"2.16.156.10011.1.19\" extension=\"" + cdaData.getCustomCol("DE01_00_021_00") + "\"/>\n" +
                        "      <!-- 住院号标识  表F.2  可维护对象OID分配表-->\n" +
                        "      <!-- HDSD00.09.085  DE01.00.014.00  住院号-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <!-- HDSD00.09.027  DE02.01.010.00  患者电话号码 -->\n" +
                        "      <!-- 移动电话 -->\n" +
                        "      <telecom use=\"MP\" value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!--\n" +
                        " HDSD00.09.013  DE02.01.010.00<  工作单位电话号码\n" +
                        "      -->\n" +
                        "      <telecom use=\"WP\" value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!-- HDSD00.09.028  DE02.01.012.00  患者电子邮件地址 -->\n" +
                        "      <telecom use=\"EM\" value=\"h123@163.com\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!-- DE02.01.030.00  患者的身份证件上的唯一法定标识符 -->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <!-- HDSD00.09.029  DE02.01.039.00  患者姓名 -->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <!-- 表G.4  用到的国标级数据元值域代码OID分配表-->\n" +
                        "        <!-- HDSD00.09.071  DE02.01.040.00  性别代码 -->\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" displayName=\"男性\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!-- HDSD00.09.030  DE02.01.018.00  婚姻状况代码 -->\n" +
                        "        <maritalStatusCode code=\"" + cdaData.getCustomCol("DE02_01_018_00") + "\" displayName=\"未婚\" codeSystem=\"2.16.156.10011.2.3.3.5\" codeSystemName=\"婚姻状况代码表（GB/T 2261.2）\"/>\n" +
                        "        <!-- HDSD00.09.041  DE02.01.025.00  民族 -->\n" +
                        "        <ethnicGroupCode code=\"" + cdaData.getCustomCol("DE02_01_025_00") + "\" displayName=\"汉族\" codeSystem=\"2.16.156.10011.2.3.3.3\" codeSystemName=\"民族类别代码表（GB 3304）\"/>\n" +
                        "        <!-- 国籍 -->\n" +
                        "        <nationality code=\"" + cdaData.getCustomCol("DE02_01_015_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.1\" codeSystemName=\"世界各国和地区名称代码(GB/T 2659)\"  displayName=\"中国\"/>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "\n" +
                        "        <!--HDSD00.09.073  DE02.01.041.00  学历代码 -->\n" +
                        "        <educationLevel>\n" +
                        "          <educationLevelCode code=\"" + cdaData.getCustomCol("DE02_01_041_00") + "\" displayName=\"普通高中毕业\" codeSystem=\"2.16.156.10011.2.3.3.6\" codeSystemName=\"学历代码表（GB/T 4658）\"/>\n" +
                        "        </educationLevel>\n" +
                        "        <!--HDSD00.09.083  DE02.01.052.00  职业类别代码 -->\n" +
                        "        <occupation>\n" +
                        "          <occupationCode code=\"" + cdaData.getCustomCol("DE02_01_052_00") + "\" displayName=\"国家公务员\" codeSystem=\"2.16.156.10011.2.3.3.13\" codeSystemName=\"从业状况（个人身体）代码表（GB/T 2261.4）\"/>\n" +
                        "        </occupation>\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 创作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <!-- 填表日期 -->\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <!-- 访视医生姓名 -->\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <!--文档管理者 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--医疗卫生服务机构标识 OID 表D.2　可维护对象OID分配表 -->\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"EMR管理机构编号\"/>\n" +
                        "        <name>XXX医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <!--法定审核者 表达对文档直接起到法律效应的法定审核者信息 -->\n" +
                        "  <legalAuthenticator typeCode=\"LA\">\n" +
                        "    <!--HDSD00.09.047  DE09.00.053.00  签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <!--医务人员标识 OID 表D.2　可维护对象OID分配表 -->\n" +
                        "      <!--HDSD00.09.082  DE02.01.039.00  责任护士签名 -->\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"责任护士工号\"/>\n" +
                        "      <code displayName=\"责任护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "  <!--文档审核者 该部分信息表达文档经过了一定的审核，但还没达到一定的法律效应 -->\n" +
                        "  <authenticator>\n" +
                        "    <!--HDSD00.09.047  DE09.00.053.00  签名日期时间 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity classCode=\"ASSIGNED\">\n" +
                        "      <!--医务人员标示 OID 表F.2 可维护对象OID分配表 -->\n" +
                        "      <!--HDSD00.09.034  DE02.01.039.00  接诊护士签名 -->\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"dh777777\"/>\n" +
                        "      <code displayName=\"接诊护士\"/>\n" +
                        "      <assignedPerson classCode=\"PSN\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <participant typeCode=\"NOT\">\n" +
                        "    <!--联系人@classCode：CON，固定值，表示角色是联系人 -->\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <code/>\n" +
                        "      <!--HDSD00.09.038  DE02.01.010.00  联系人电话号码 -->\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <!--联系人-->\n" +
                        "      <associatedPerson>\n" +
                        "        <!--HDSD00.09.039  DE02.01.039.00  联系人姓名 -->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <!-- 入院日期时间 -->\n" +
                        "      <effectiveTime/>\n" +
                        "      <location>\n" +
                        "        <healthCareFacility>\n" +
                        "          <serviceProviderOrganization>\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!-- DE01.00.026.00  病床号 -->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!-- DE01.00.019.00  病房号 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!-- DE08.10.026.00  科室名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                        <!-- DE08.10.054.00  病区名称 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                            <!--XXX医院 -->\n" +
                        "                            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                                <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "                                <name>" + cdaData.getCustomCol("DE08_10_052_00") + "</name>\n" +
                        "                              </wholeOrganization>\n" +
                        "                            </asOrganizationPartOf>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </serviceProviderOrganization>\n" +
                        "        </healthCareFacility>\n" +
                        "      </location>\n" +
                        "    </encompassingEncounter>\n" +
                        "  </componentOf>\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--入院信息章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"入院信息\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--HDSD00.09.053  DE05.10.053.00  入院原因 -->\n" +
                        "              <code code=\"DE05.10.053.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院原因\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_053_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--HDSD00.09.052  DE06.00.339.00  入院途径代码 -->\n" +
                        "              <code code=\"DE06.00.339.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院途径代码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_339_00") + "\" displayName=\"门诊\" codeSystem=\"2.16.156.10011.2.3.1.270\" codeSystemName=\"入院途径代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.237.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入病房方式\"/>\n" +
                        "              <!--HDSD00.09.050  DE06.00.237.00  入病房方式 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_237_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--症状章节  补充LOINC代码-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11450-4\" displayName=\"PROBLEM LIST\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.118.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"主要症状名称\"/>\n" +
                        "              <!--HDSD00.09.084  DE04.01.117.00  主要症状名称 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_01_118_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--生命体征章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8716-3\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"VITAL SIGNS\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.186.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体温(℃)\"/>\n" +
                        "              <!-- HDSD00.09.063  DE04.10.186.00  体温（℃）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_186_00") + "\" unit=\"℃\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.118.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"脉率\"/>\n" +
                        "              <!-- HDSD00.09.040  DE04.10.118.00  脉率（次/min）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_118_00") + "\" unit=\"次/min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.081.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"呼吸频次\"/>\n" +
                        "              <!-- HDSD00.09.016  DE04.10.081.00  呼吸频率（次/min）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_082_00") + "\" unit=\"次/min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.174.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"收缩压\"/>\n" +
                        "                  <!-- HDSD00.09.056  DE04.10.174.00  收缩压（mmHg）-->\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_174_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.176.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"舒张压\"/>\n" +
                        "                  <!-- HDSD00.09.058  DE04.10.176.00  舒张压（mmHg）-->\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_176_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.188.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体重\"/>\n" +
                        "              <!-- HDSD00.09.064  DE04.10.188.00  体重（kg）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"kg\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--既往史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11348-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF PAST ILLNESS\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.026.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"疾病史(含外伤)\"/>\n" +
                        "              <!--HDSD00.09.031  DE02.10.026.00  疾病史（含外伤）-->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_026_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.008.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"传染病史\"/>\n" +
                        "              <!--HDSD00.09.009  DE02.10.008.00  传染病史 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_008_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.101.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"预防接种史\"/>\n" +
                        "              <!--HDSD00.09.081  DE02.10.101.00  预防接种史 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_101_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.061.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术史\"/>\n" +
                        "              <!--HDSD00.09.057  DE02.10.061.00  手术史 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_061_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.100.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"输血史\"/>\n" +
                        "              <!--HDSD00.09.059  DE02.10.100.00  输血史 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_100_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"一般健康状况标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"true\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"患者传染性标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"true\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--过敏史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <!--code code=\"10155-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF ALLERGIES\"/-->\n" +
                        "          <code code=\"48765-2\" displayName=\"Allergies, adverse reactions, alerts\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <!--HDSD00.09.015  DE02.10.022.00  过敏史 -->\n" +
                        "              <code code=\"DE02.10.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"过敏史\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_022_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--家族史章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10157-6\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF FAMILY MEMBER DISEASES\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.103.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"家族史\"/>\n" +
                        "              <!--HDSD00.09.033  DE02.10.103.00  家族史 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_103_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--健康评估章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"51848-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Assessment note\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.001.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"Apgar评分值\"/>\n" +
                        "              <!--HDSD00.09.001  DE05.10.001.00  Apgar评分值-->\n" +
                        "              <value xsi:type=\"INT\" value=\"" + cdaData.getCustomCol("DE05_10_001_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.022.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"发育程度代码\"/>\n" +
                        "              <!--HDSD00.09.011  DE05.10.022.00  发育程度代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_022_00") + "\" displayName=\"正力型\" codeSystem=\"2.16.156.10011.2.3.2.53\" codeSystemName=\"发育程度代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.142.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"精神状态正常标志\"/>\n" +
                        "              <!--HDSD00.09.035  DE05.10.142.00  精神状态正常标志 -->\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE05_10_142_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.065.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"睡眠状况\"/>\n" +
                        "              <!--HDSD00.09.060  DE05.10.065.00  睡眠状况 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_065_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.158.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"特殊情况\"/>\n" +
                        "              <!--HDSD00.09.061  DE05.10.158.00  特殊情况 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_10_158_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.084.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"心理状态代码\"/>\n" +
                        "              <!--HDSD00.09.070  DE05.10.084.00  心理状态代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_084_00") + "\" displayName=\"抑郁\" codeSystem=\"2.16.156.10011.2.3.1.140\" codeSystemName=\"心理状态代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.097.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"营养状态代码\"/>\n" +
                        "              <!--HDSD00.09.079  DE05.10.097.00  营养状态代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_097_00") + "\" displayName=\"良好\" codeSystem=\"2.16.156.10011.2.3.2.54\" codeSystemName=\"营养状态代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.122.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"自理能力代码\"/>\n" +
                        "              <!--HDSD00.09.086  DE05.10.122.00  自理能力代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_122_00") + "\" displayName=\"完全自理\" codeSystem=\"2.16.156.10011.2.3.2.55\" codeSystemName=\"自理能力代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--生活方式章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"生活方式\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.070.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"吸烟标志\"/>\n" +
                        "              <!--HDSD00.09.068  DE03.00.070.00  吸烟标志-->\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE03_00_070_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"吸烟状况代码\"/>\n" +
                        "              <!--HDSD00.09.069  DE03.00.073.00  吸烟状况代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE03_00_073_00") + "\" displayName=\"从不吸烟\" codeSystem=\"2.16.156.10011.2.3.2.56\" codeSystemName=\"吸烟状况代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.053.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"日吸烟量(支)\"/>\n" +
                        "              <!--HDSD00.09.048  DE03.00.053.00  日吸烟量（支）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE03_00_053_00") + "\" unit=\"支\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.065.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"停止吸烟天数\"/>\n" +
                        "              <!--HDSD00.09.065  DE03.00.065.00  停止吸烟天数 -->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE03_00_065_00") + "\" unit=\"d\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.030.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"饮酒标志\"/>\n" +
                        "              <!--HDSD00.09.075  DE03.00.030.00  饮酒标志 -->\n" +
                        "              <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE03_00_081_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.076.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"饮酒频率代码\"/>\n" +
                        "              <!--HDSD00.09.076  DE03.00.076.00  饮酒频率代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE03_00_076_00") + "\" displayName=\"从不\" codeSystem=\"2.16.156.10011.2.3.1.16\" codeSystemName=\"饮酒频率代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.054.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"日饮酒量（mL）\"/>\n" +
                        "              <!--HDSD00.09.049  DE03.00.054.00  日饮酒量（mL）-->\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE03_00_054_00") + "\" unit=\"mL\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.080.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"饮食情况代码\"/>\n" +
                        "              <!--HDSD00.09.077  DE03.00.080.00  饮食情况代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE03_00_080_00") + "\" displayName=\"良好\" codeSystem=\"2.16.156.10011.2.3.2.34\" codeSystemName=\"饮食情况代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--入院诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"46241-6\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HOSPITAL ADMISSION DX\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"入院诊断编码\"/>\n" +
                        "              <!--HDSD00.09.054  DE05.01.024.00  入院诊断编码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE02_10_024_00") + "\" displayName=\"高血压病\" codeSystem=\"2.16.156.10011.2.3.3.11\" codeSystemName=\"ICD-10\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--护理观察章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"护理观察\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察项目名称\"/>\n" +
                        "              <!--HDSD00.09.022  DE02.10.031.00  护理观察项目名称 -->\n" +
                        "              <value xsi:type=\"ST\">护理观察项目名称</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察结果\"/>\n" +
                        "                  <!--HDSD00.09.021  DE02.10.028.00  护理观察结果 -->\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!-- 住院过程章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"8648-8\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Hospital Course\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 通知医师情况 -->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.280.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"通知医师标志\"/>\n" +
                        "              <value xsi:type=\"BL\" value=\"true\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.279.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"通知医师日期时间\"/>\n" +
                        "                  <value xsi:type=\"TS\" value=\"20130203121314\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <!-- 评估日期时间 -->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.144.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"评估日期时间\"/>\n" +
                        "              <value xsi:type=\"TS\" value=\"20130203121314\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
