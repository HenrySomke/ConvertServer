package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 死亡病例讨论记录子集
 */
public class HDSD00_14_07 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_14_07(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.71\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0051\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>死亡病例讨论记录</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\" displayName=\"女性\" />\n" +
                        "        <!--1数据集里是年龄（年）、年龄（月）-->\n" +
                        "        <birthTime value=\"" + cdaData.getCustomCol("DE02_01_005_01") + "\"/>\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"/>\n" +
                        "      </patient>\n" +
                        "      <!--讨论的日期时间-->\n" +
                        "      <providerOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <asOrganizationPartOf  classCode=\"PART\">\n" +
                        "        <!--讨论时间-->\n" +
                        "        <effectiveTime value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"></effectiveTime>\n" +
                        "          <wholeOrganization>\n" +
                        "            <addr>" + cdaData.getCustomCol("DE06_00_274_00") + "</addr>\n" +
                        "          </wholeOrganization>\n" +
                        "        </asOrganizationPartOf>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <time value=\"20110404\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"4662860471\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <authenticator>\n" +
                        "    <!-- DE09.00.053.00  签名日期时间  -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"住院医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <professionalTechnicalPosition>\n" +
                        "          <professionaltechnicalpositionCode code=\"1\" codeSystem=\"2.16.156.10011.2.3.1.209\" codeSystemName=\"专业技术职务类别代码表\" displayName=\"正高\"></professionaltechnicalpositionCode>\n" +
                        "        </professionalTechnicalPosition>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <!-- DE09.00.053.00  签名日期时间  -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code  displayName=\"主治医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <professionalTechnicalPosition>\n" +
                        "          <professionaltechnicalpositionCode code=\"" + cdaData.getCustomCol("DE08_30_031_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.209\" codeSystemName=\"专业技术职务类别代码表\" displayName=\"正高\"></professionaltechnicalpositionCode>\n" +
                        "        </professionalTechnicalPosition>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <authenticator>\n" +
                        "    <!-- DE09.00.053.00  签名日期时间  -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"主任医师\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <professionalTechnicalPosition>\n" +
                        "          <professionaltechnicalpositionCode code=\"" + cdaData.getCustomCol("DE08_30_031_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.209\" codeSystemName=\"专业技术职务类别代码表\" displayName=\"正高\"></professionaltechnicalpositionCode>\n" +
                        "        </professionalTechnicalPosition>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <!--讨论成员信息-->\n" +
                        "  <participant typeCode=\"CON\">\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <!--参加讨论人员名单-->\n" +
                        "      <associatedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_30_032_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "  <!--讨论主持人信息-->\n" +
                        "  <participant typeCode=\"ORG\">\n" +
                        "    <associatedEntity classCode=\"ECON\">\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编码\"/>\n" +
                        "      <code displayName=\"主持人\"/>\n" +
                        "      <associatedPerson>\n" +
                        "        <!--主持人姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </associatedPerson>\n" +
                        "    </associatedEntity>\n" +
                        "  </participant>\n" +
                        "\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "\n" +
                        "  <!-- 病床号、病房、病区、科室和医院的关联 -->\n" +
                        "  <componentOf>\n" +
                        "    <encompassingEncounter>\n" +
                        "      <code displayName=\"入院日期时间\"/>\n" +
                        "      <effectiveTime xsi:type=\"IVL_TS\" value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
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
                        "      <!--死亡原因章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"死亡原因\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"直接死亡原因名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE05_01_025_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.021.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"直接死亡原因编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_021_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.2\" codeSystemName=\"死因代码表（ICD-10）\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11535-2\" displayName=\"HOSPITAL DISCHARGE DX\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.025.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_01_025_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.021.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_021_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11\" codeSystemName=\"ICD-10诊断编码表\" displayName=\"死亡\" />\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--讨论内容章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"DE06.00.181.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"死亡讨论记录\"/>\n" +
                        "          <text>" + cdaData.getCustomCol("DE06_00_181_00") + "</text>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--讨论总结章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"DE06.00.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"主持人总结意见\"/>\n" +
                        "          <text>" + cdaData.getCustomCol("DE06_00_018_00") + "</text>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
