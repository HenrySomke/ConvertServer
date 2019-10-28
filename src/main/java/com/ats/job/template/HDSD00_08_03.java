package com.ats.job.template;

import com.ats.job.bean.CDAData;

/**
 * 生命体征测量记录子集
 */
public class HDSD00_08_03 {
    private String CDA = "";
    public String toString() {
        return CDA;
    }

    public HDSD00_08_03(CDAData cdaData) {
        CDA =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<ClinicalDocument xmlns=\"urn:hl7-org:v3\" xmlns:mif=\"urn:hl7-org:v3/mif\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 ..\\sdschemas\\CDA.xsd\">\n" +
                        "  <realmCode code=\"CN\"/>\n" +
                        "  <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_MT000040\"/>\n" +
                        "  <templateId root=\"2.16.156.10011.2.1.1.40\"/>\n" +
                        "  <!-- 文档流水号 -->\n" +
                        "  <id root=\"2.16.156.10011.1.1\" extension=\"RN001\"/>\n" +
                        "  <code code=\"C0020\" codeSystem=\"2.16.156.10011.2.4\" codeSystemName=\"卫生信息共享文档规范编码体系\"/>\n" +
                        "  <title>生命体征测量记录</title>\n" +
                        "  <!-- 文档机器生成时间 -->\n" +
                        "  <effectiveTime value=\"20121024154823\"/>\n" +
                        "  <confidentialityCode code=\"N\" codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName=\"Confidentiality\" displayName=\"正常访问保密级别\"/>\n" +
                        "  <!--N:全部改为zh-CN，ＯＫ-->\n" +
                        "  <languageCode code=\"zh-CN\"/>\n" +
                        "  <setId/>\n" +
                        "  <versionNumber/>\n" +
                        "  <recordTarget typeCode=\"RCT\" contextControlCode=\"OP\">\n" +
                        "    <patientRole classCode=\"PAT\">\n" +
                        "      <!--住院号：DE01.00.014.00  @@@参照OID分配表修改 -->\n" +
                        "      <id root=\"2.16.156.10011.1.12\" extension=\"" + cdaData.getCustomCol("DE01_00_014_00") + "\"/>\n" +
                        "      <patient classCode=\"PSN\" determinerCode=\"INSTANCE\">\n" +
                        "        <!--患者身份证号标识-->\n" +
                        "        <id root=\"2.16.156.10011.1.3\" extension=\"" + cdaData.getCustomCol("DE02_01_031_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "        <administrativeGenderCode code=\"" + cdaData.getCustomCol("DE02_01_040_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.4\" codeSystemName=\"生理性别代码表（GB/T 2261.1）\"/>\n" +
                        "        <!--N:有就填-->\n" +
                        "        <age value=\"" + cdaData.getCustomCol("DE02_01_026_00") + "\" unit=\"岁\"/>\n" +
                        "      </patient>\n" +
                        "      <providerOrganization>\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"" + cdaData.getCustomCol("DE08_10_052_00") + "\"/>\n" +
                        "        <name>" + cdaData.getCustomCol("DE08_10_013_00") + "</name>\n" +
                        "      </providerOrganization>\n" +
                        "    </patientRole>\n" +
                        "  </recordTarget>\n" +
                        "  <!-- 文档作者 -->\n" +
                        "  <author typeCode=\"AUT\" contextControlCode=\"OP\">\n" +
                        "    <!--签名日期时间：DE09.00.053.00-->\n" +
                        "    <time xsi:type=\"TS\" value=\"" + cdaData.getCustomCol("DE09_00_053_00") + "\"/>\n" +
                        "    <assignedAuthor classCode=\"ASSIGNED\">\n" +
                        "      <id root=\"2.16.156.10011.1.7\" extension=\"234234234\"/>\n" +
                        "      <code displayName=\"护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedAuthor>\n" +
                        "  </author>\n" +
                        "  <!-- 文档生成机构 -->\n" +
                        "  <custodian typeCode=\"CST\">\n" +
                        "    <assignedCustodian classCode=\"ASSIGNED\">\n" +
                        "      <representedCustodianOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "        <id root=\"2.16.156.10011.1.5\" extension=\"医疗卫生机构编号\"/>\n" +
                        "        <name>xx医院</name>\n" +
                        "      </representedCustodianOrganization>\n" +
                        "    </assignedCustodian>\n" +
                        "  </custodian>\n" +
                        "  <!-- 签名 -->\n" +
                        "  <authenticator>\n" +
                        "    <!--签名日期时间：DE09.00.053.00 -->\n" +
                        "    <time value=\"201210240910\"/>\n" +
                        "    <signatureCode/>\n" +
                        "    <assignedEntity>\n" +
                        "      <id root=\"2.16.156.10011.1.4\" extension=\"医务人员编号\"/>\n" +
                        "      <code displayName=\"护士\"/>\n" +
                        "      <assignedPerson>\n" +
                        "        <!--姓名-->\n" +
                        "        <name>" + cdaData.getCustomCol("DE02_01_039_00") + "</name>\n" +
                        "      </assignedPerson>\n" +
                        "    </assignedEntity>\n" +
                        "  </authenticator>\n" +
                        "  <documentationOf>\n" +
                        "    <serviceEvent>\n" +
                        "      <code/>\n" +
                        "      <effectiveTime>\n" +
                        "        <!--手术或分娩后天数-->\n" +
                        "        <width value=\"100\" unit=\"天\"/>\n" +
                        "      </effectiveTime>\n" +
                        "    </serviceEvent>\n" +
                        "  </documentationOf>\n" +
                        "  <relatedDocument typeCode=\"RPLC\">\n" +
                        "    <parentDocument>\n" +
                        "      <id/>\n" +
                        "      <setId/>\n" +
                        "      <versionNumber/>\n" +
                        "    </parentDocument>\n" +
                        "  </relatedDocument>\n" +
                        "  <!--文档中医疗卫生事件的就诊场景,即入院场景记录-->\n" +
                        "  <componentOf typeCode=\"COMP\">\n" +
                        "    <!--就诊-->\n" +
                        "    <encompassingEncounter classCode=\"ENC\" moodCode=\"EVN\">\n" +
                        "      <code/>\n" +
                        "      <!--就诊时间-->\n" +
                        "      <effectiveTime>\n" +
                        "        <!--入院日期-->\n" +
                        "        <low value=\"" + cdaData.getCustomCol("DE06_00_092_00") + "\"/>\n" +
                        "        <!--实际住院天数-->\n" +
                        "        <width value=\"10\" unit=\"天\"/>\n" +
                        "      </effectiveTime>\n" +
                        "      <location typeCode=\"LOC\">\n" +
                        "        <healthCareFacility classCode=\"SDLOC\">\n" +
                        "          <!--机构角色-->\n" +
                        "          <serviceProviderOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "            <asOrganizationPartOf classCode=\"PART\">\n" +
                        "              <!--病床号：DE01.00.026.00-->\n" +
                        "              <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                <!--N:加上OID-->\n" +
                        "                <id root=\"2.16.156.10011.1.22\" extension=\"" + cdaData.getCustomCol("DE01_00_026_00") + "\"/>\n" +
                        "                <name>" + cdaData.getCustomCol("DE01_00_026_00") + "</name>\n" +
                        "                <!--病房号：DE01.00.019.00-->\n" +
                        "                <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                  <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                    <!--N:加上OID-->\n" +
                        "                    <id root=\"2.16.156.10011.1.21\" extension=\"" + cdaData.getCustomCol("DE01_00_019_00") + "\"/>\n" +
                        "                    <name>" + cdaData.getCustomCol("DE01_00_019_00") + "</name>\n" +
                        "                    <!--病区名称：DE08.10.054.00-->\n" +
                        "                    <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                      <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                        <!--N:加上OID-->\n" +
                        "                        <id root=\"2.16.156.10011.1.27\" extension=\"" + cdaData.getCustomCol("DE08_10_054_00") + "\"/>\n" +
                        "                        <name>" + cdaData.getCustomCol("DE08_10_054_00") + "</name>\n" +
                        "                        <!--科室名称：DE08.10.026.00-->\n" +
                        "                        <asOrganizationPartOf classCode=\"PART\">\n" +
                        "                          <wholeOrganization classCode=\"ORG\" determinerCode=\"INSTANCE\">\n" +
                        "                            <!--N:加上OID-->\n" +
                        "                            <id root=\"2.16.156.10011.1.26\" extension=\"" + cdaData.getCustomCol("DE08_10_026_00") + "\"/>\n" +
                        "                            <name>" + cdaData.getCustomCol("DE08_10_026_00") + "</name>\n" +
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
                        "      <!--诊断章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code code=\"29548-5\" displayName=\"Diagnosis\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\"/>\n" +
                        "          <text/>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE05.01.024.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"疾病诊断编码\"/>\n" +
                        "              <value xsi:type=\"CD\" code=\"" + cdaData.getCustomCol("DE05_01_024_00") + "\" codeSystem=\"2.16.156.10011.2.3.3.11.5\" codeSystemName=\"疾病代码表（ICD-10）\"/>\n" +
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
                        "              <code code=\"DE04.10.081.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"呼吸频率（次/min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_081_00") + "\" unit=\"次/min\"/>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE06.00.239.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"使用呼吸机标志\"/>\n" +
                        "                  <value xsi:type=\"BL\" value=\"" + cdaData.getCustomCol("DE06_00_239_00") + "\"/>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.118.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"脉率（次/min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_118_00") + "\" unit=\"次/min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.206.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"起搏器心率（次/min）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_206_00") + "\" unit=\"次/min\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.186.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体温（℃）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_186_00") + "\" unit=\"℃\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <organizer classCode=\"BATTERY\" moodCode=\"EVN\">\n" +
                        "              <statusCode/>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.174.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"收缩压\"/>\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_174_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "              <component>\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE04.10.176.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"舒张压\"/>\n" +
                        "                  <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_176_00") + "\" unit=\"mmHg\"/>\n" +
                        "                </observation>\n" +
                        "              </component>\n" +
                        "            </organizer>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.188.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"体重（kg）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_188_00") + "\" unit=\"kg\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE04.10.052.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"腹围（cm）\"/>\n" +
                        "              <value xsi:type=\"PQ\" value=\"" + cdaData.getCustomCol("DE04_10_052_00") + "\" unit=\"cm\"/>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "      <!--护理观察章节-->\n" +
                        "      <component>\n" +
                        "        <section>\n" +
                        "          <code displayName=\"护理观察\"/>\n" +
                        "          <text/>\n" +
                        "          <!--多个观察写多个entry即可，每个观察对应着观察结果描述-->\n" +
                        "          <entry>\n" +
                        "            <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "              <code code=\"DE02.10.031.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察项目名称\"/>\n" +
                        "              <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_031_00") + "</value>\n" +
                        "              <entryRelationship typeCode=\"COMP\">\n" +
                        "                <observation classCode=\"OBS\" moodCode=\"EVN\">\n" +
                        "                  <code code=\"DE02.10.028.00\" codeSystem=\"2.16.156.10011.2.2.1\" codeSystemName=\"卫生信息数据元目录\" displayName=\"护理观察结果\"/>\n" +
                        "                  <value xsi:type=\"ST\">" + cdaData.getCustomCol("DE02_10_028_00") + "</value>\n" +
                        "                </observation>\n" +
                        "              </entryRelationship>\n" +
                        "            </observation>\n" +
                        "          </entry>\n" +
                        "        </section>\n" +
                        "      </component>\n" +
                        "    </structuredBody>\n" +
                        "  </component>\n" +
                        "</ClinicalDocument>";
    }
}
