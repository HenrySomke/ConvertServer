package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 检查记录子集
 */
public class HDSD00_05_02 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_05_02(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "<!--\n" +
                        "********************************************************\n" +
                        " CDA Header\n" +
                        "********************************************************\n" +
                        "-->\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.26\"/>\n" +
                        "\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "\n" +
                        "  <code code=\"C0006\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>检查报告</title>\n" +
                        "\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "\n" +
                        "  <!--文档记录对象（患者）-->\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "\n" +
                        "      <!--门（急）诊号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.11\" extension=\"" + cdaData.getCustomCol("DE01_00_010_00") + "\"/>\n" +
                        "\n" +
                        "      <!--住院号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "\n" +
                        "      <!--检查报告单号标识-->\n" +
                        "      <id root=\"2.16.156.10011.1.32\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                        "\n" +
                        "      <!--电子申请单编号-->\n" +
                        "      <id root=\"2.16.156.10011.1.24\" extension=\"" + cdaData.getCustomCol("DE01_00_008_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 标本编号标识 -->\n" +
                        "      <id root=\"2.16.156.10011.1.14\" extension=\"" + cdaData.getCustomCol("DE01_00_003_00") + "\"/>\n" +
                        "\n" +
                        "      <!-- 患者类别代码 -->\n" +
                        "      <patientType>\n" +
                        "        <patienttypeCode code=\"1\" codeSystem=\"2.16.156.10011.2.3.1.271\" codeSystemName=\"患者类型代码表\" displayName=\"门诊\"></patienttypeCode>\n" +
                        "      </patientType>\n" +
                        "\n" +
                        "      <telecom value=\"" + cdaData.getCustomCol("DE02_01_010_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_030_00") + "\"/>\n" +
                        "\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "\n" +
                        "        <!-- 年龄 -->\n" +
                        "        <age unit=\"岁\" value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\"></age>\n" +
                        "\n" +
                        "      </patient>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "\n" +
                        "  <!-- 检查报告医师（文档创作者） -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "\n" +
                        "    <!-- 检查报告日期 -->\n" +
                        "    <time value=\"" + cdaData.getCustomCol("DE04_50_133_00") + "\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <!-- 医师姓名 -->\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "\n" +
                        "  <!-- 保管机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "      <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "        </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "\n" +
                        "  <!-- 审核医师签名 -->\n" +
                        "  <legalAuthenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"审核医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </legalAuthenticator>\n" +
                        "\n" +
                        "  <!-- 检查技师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"检查技师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 检查医师签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <time/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"检查医师\"></code>\n" +
                        "      <assignedPerson classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "\n" +
                        "  <!-- 检查申请机构及科室 -->\n" +
                        "  <participant typeCode=\"PRF\">\n" +
                        "    <associatedEntity classCode=\"ASSIGNED\">\n" +
                        "      <scopingOrganization>\n" +
                        "        <id root=\"2.16.156.10011.1.26\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
                        "        <asOrganizationPartOf>\n" +
                        "          <wholeOrganization>\n" +
                        "            <id root=\"2.16.156.10011.1.5\" extension=\"检查申请机构编号\"/>\n" +
                        "            <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "          </wholeOrganization>\n" +
                        "        </asOrganizationPartOf>\n" +
                        "      </scopingOrganization>\n" +
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
                        "\n" +
                        "<!--***************************************************\n" +
                        "文档体Body\n" +
                        "*******************************************************\n" +
                        "-->\n" +
                        "  <component>\n" +
                        "    <structuredBody>\n" +
                        "\n" +
                        "            <!-- 诊断记录章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "                    <code code=\"29548-5\" displayName=\"Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "                    <text/>\n" +
                        "                    <!--条目：诊断-->\n" +
                        "                    <entry>\n" +
                        "                        <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                            <code code=\"DE05.01.024.00\" displayName=\"诊断代码\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\"/>\n" +
                        "                            <!--诊断日期-->\n" +
                        "                            <effectiveTime value=\"" + cdaData.getCustomCol("DE05_01_058_00") + "\"></effectiveTime>\n" +
                        "                            <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.3\" codeSystemName=\"诊断代码表（ICD-10）\"></value>\n" +
                        "                            <performer>\n" +
                        "                <assignedEntity>\n" +
                        "                  <id/>\n" +
                        "                  <representedOrganization>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "                  </representedOrganization>\n" +
                        "                </assignedEntity>\n" +
                        "              </performer>\n" +
                        "                        </observation>\n" +
                        "                    </entry>\n" +
                        "               </section>\n" +
                        "            </component>\n" +
                        "\n" +
                        "      <!-- 主诉章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"10154-3\" displayName=\"CHIEF COMPLAINT\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--主诉条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.119.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"主诉\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_10_119_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 症状章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"11450-4\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"PROBLEM LIST\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 症状描述条目 -->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.01.117.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"症状描述\"/>\n" +
                        "              <!-- 症状开始时间与停止时间 -->\n" +
                        "              <effectiveTime>\n" +
                        "                <low value=\"" + cdaData.getCustomCol("DE06_00_221_00") + "\"></low>\n" +
                        "                <high value=\"" + cdaData.getCustomCol("DE06_00_218_00") + "\"></high>\n" +
                        "              </effectiveTime>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_01_117_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 手术操作章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"47519-4\" displayName=\"HISTORY OF PROCEDURES\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <!-- 1..1 手术记录 -->\n" +
                        "            <procedure classCode=\"PROC\" moodCode=\"EVN\">\n" +
                        "              <code code=\"" + cdaData.getCustomCol("DE06_00_093_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.12\" codeSystemName=\"手术(操作)代码表（ICD-9-CM）\"/>\n" +
                        "              <statusCode/>\n" +
                        "              <!--操作日期/时间-->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE06_00_095_00") + "\"/>\n" +
                        "              <!-- 操作部位代码 -->\n" +
                        "              <targetSiteCode code=\"" + cdaData.getCustomCol("DE06_00_186_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.266\" codeSystemName=\"操作部位代码表\"/>\n" +
                        "\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.094.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"手术（操作）名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_094_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.037.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"介入物名称\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_037_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.251.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"操作方法描述\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_251_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.250.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"操作次数\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_250_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <!-- 0..1 麻醉信息 -->\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.073.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉方式代码\"/>\n" +
                        "                  <value code=\"" + cdaData.getCustomCol("DE06_00_073_00") + "\" codeSystem=\"2.16.156.10011.2.3.1.159\" codeSystemName=\"麻醉方式代码表\" xsi:type=\"CD\"></value>\n" +
                        "                  <!-- 麻醉医师签名 -->\n" +
                        "                  <performer>\n" +
                        "                    <assignedEntity>\n" +
                        "                      <id></id>\n" +
                        "                      <assignedPerson>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "                      </assignedPerson>\n" +
                        "                    </assignedEntity>\n" +
                        "                  </performer>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉观察结果\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.307.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"麻醉中西医标识代码\"/>\n" +
                        "                  <value code=\"" + cdaData.getCustomCol("DE06_00_307_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.41\" codeSystemName=\"麻醉中西医标识代码表\" xsi:type=\"CD\"></value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </procedure>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 体格检查章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29545-1\" displayName=\"PHYSICAL EXAMINATION\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <!--特殊检查条目-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.01.079.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"特殊检查标志\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_01_079_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.027.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查方法名称\"></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_027_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.018.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查类别\"></code>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_018_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.019.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查项目代码\"></code>\n" +
                        "              <!-- 检查日期 -->\n" +
                        "              <effectiveTime value=\"" + cdaData.getCustomCol("DE04_50_140_00") + "\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_019_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.134.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"标本类别\"></code>\n" +
                        "                  <!-- DE04.50.137.00  标本采样日期时间\n" +
                        "DE04.50.141.00  接收标本日期时间 -->\n" +
                        "                  <effectiveTime>\n" +
                        "                    <low value=\"" + cdaData.getCustomCol("DE04_50_137_00") + "\"></low>\n" +
                        "                    <high value=\"" + cdaData.getCustomCol("DE04_50_141_00") + "\"></high>\n" +
                        "                  </effectiveTime>\n" +
                        "                  <value xsi:type=\"ST\">标本类别</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.50.135.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"标本状态\"></code>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_135_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE08.50.027.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"标本固定液名称\"></code>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_50_027_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.017.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查结果代码\"></code>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE04_30_017_00") + "\" codeSystem=\"2.16.156.10011.2.3.2.38\" codeSystemName=\"检查（检验）结果代码表\"></value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.30.015.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查定量结果\"></code>\n" +
                        "              <value xsi:type=\"REAL\" value=\"" + cdaData.getCustomCol("DE04_30_015_00") + "\"></value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.30.016.00\" displayName=\"检查定量结果计量单位\" codeSystemName=\"卫生信息数据元目录\" codeSystem=\"2.16.156.10011.2.2.1\" />\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_30_016_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!--  其他处置章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"其他处置章节\"/>\n" +
                        "          <text/>\n" +
                        "          <!-- 诊疗过程描述　-->\n" +
                        "          <entry typeCode=\"COMP\">\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.296.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"诊疗过程描述\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_296_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "\n" +
                        "      <!-- 检查报告章节 -->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"检查报告\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.131.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查报告结果-客观所见\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_131_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.50.132.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查报告结果-主观提示\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE04_50_132_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.10.026.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查报告科室\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_10_026_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE08.10.013.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查报告机构名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE08_10_013_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE06.00.179.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"检查报告备注\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE06_00_179_00") + "</value>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
