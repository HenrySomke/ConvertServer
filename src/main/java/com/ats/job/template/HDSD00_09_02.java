package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 出院评估与指导记录子集
 */
public class HDSD00_09_02 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_09_02(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <!-- 文档信息模型类别-标识符 HL7注册模型的编码系统OID -->\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <!-- 文档模板的根OID  -->\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.45\"/>\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "  <!-- 中国卫生信息开放系统互连对象标识OID分配表  表D.4　固定对象OID分配 2.16.156.10011.2.4-->\n" +
                        "  <!-- 卫生信息共享文档分类编码系统OID  表A.1  卫生信息共享文档分类编码系 B00??-->\n" +
                        "  <code code=\"C0025\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <!--修改title-->\n" +
                        "  <title>出院评估与指导</title>\n" +
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
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!-- DE02.01.030.00  患者的身份证件上的唯一法定标识符 -->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <!-- HDSD00.09.029  DE02.01.039.00  患者姓名 -->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <!-- HDSD00.09.071  DE02.01.040.00  性别代码 -->\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" displayName=\"男性\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "      </patient>\n" +
                        "      <providerOrganization>\n" +
                        "        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "          <!--HDSD00.09.003  DE01.00.026.00  病床号 -->\n" +
                        "          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "            <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "            <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "            <!--HDSD00.09.004  DE01.00.019.00  病房号 -->\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                <!--HDSD00.09.036  DE08.10.026.00  科室名称 -->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "                    <!--HDSD00.09.005  DE08.10.054.00  病区名称 -->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                        <!--XXX医院 -->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <!-- 医疗卫生服务机构标识 表F.2  可维护对象OID分配表-->\n" +
                        "                            <id root=\"2.16.156.10011.1.5\" extension=\"001\"/>\n" +
                        "                            <name>XXX医院</name>\n" +
                        "                          </wholeOrganization>\n" +
                        "                        </asOrganizationPartOf>\n" +
                        "                      </wholeOrganization>\n" +
                        "                    </asOrganizationPartOf>\n" +
                        "                  </wholeOrganization>\n" +
                        "                </asOrganizationPartOf>\n" +
                        "              </wholeOrganization>\n" +
                        "            </asOrganizationPartOf>\n" +
                        "          </wholeOrganization>\n" +
                        "        </asOrganizationPartOf>\n" +
                        "      </providerOrganization>\n" +
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
                        "  <!--文档审核者 该部分信息表达文档经过了一定的审核，但还没达到一定的法律效应 -->\n" +
                        "  <authenticator typeCode=\"AUTHEN\">\n" +
                        "    <!--HDSD00.09.047  DE09.00.053.00  签名日期时间 -->\n" +
                        "    <time value=\"20121110192930\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity classCode=\"ASSIGNED\">\n" +
                        "      <!--医务人员标识 OID 表D.2　可维护对象OID分配表 -->\n" +
                        "      <!--HDSD00.09.025  DE02.01.039.00  护士签名 -->\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"dh777777\"/>\n" +
                        "      <assignedPerson classCode=\"PSN\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "      <!--出院诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11535-2\" displayName=\"Discharge Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" displayName=\"出院诊断编码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.008  DE05.01.024.00  出院诊断编码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" displayName=\"高血压病\" codeSystem=\"2.16.156.10011.2.3.3.11\" codeSystemName=\"ICD-10\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.017.00\" displayName=\"出院日期时间\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.007  DE06.00.017.00  出院日期时间 -->\n" +
                        "              <value xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE06_00_017_00") + "\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.193.00\" displayName=\"出院情况\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.006  DE06.00.193.00  出院情况 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_193_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.223.00\" displayName=\"离院方式代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.037  DE06.00.223.00  离院方式代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_223_00") + "\" displayName=\"医嘱离院\" codeSystem=\"2.16.156.10011.2.3.1.265\" codeSystemName=\"离院方式代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--健康指导章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"69730-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Instructions\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.291.00\" displayName=\"饮食指导代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.077  DE03.00.080.00  饮食情况代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE06_00_291_00") + "\" displayName=\"普通饮食\" codeSystem=\"2.16.156.10011.2.3.1.263\" codeSystemName=\"饮食指导代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.238.00\" displayName=\"生活方式指导\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.055  DE06.00.238.00  生活方式指导 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_299_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.124.00\" displayName=\"宣教内容\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.072  DE06.00.124.00  宣教内容 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_124_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.299.00\" displayName=\"复诊指导\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.012  DE06.00.299.00  复诊指导 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_299_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.136.00\" displayName=\"用药指导\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.080  DE06.00.136.00  用药指导 -->\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_136_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--健康评估章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"51848-0\" displayName=\"Assessment note\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.10.122.00\" displayName=\"自理能力代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.086  DE05.10.122.00  自理能力代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_10_122_00") + "\" displayName=\"完全自理\" codeSystem=\"2.16.156.10011.2.3.2.55\" codeSystemName=\"自理能力代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE03.00.080.00\" displayName=\"饮食情况代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "              <!--HDSD00.09.077  DE03.00.080.00  饮食情况代码 -->\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE03_00_080_00") + "\" displayName=\"良好\" codeSystem=\"2.16.156.10011.2.3.2.34\" codeSystemName=\"饮食情况代码表\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
